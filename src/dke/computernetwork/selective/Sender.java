package dke.computernetwork.selective;

public class Sender {

    static Pipeline pipeline = new Pipeline();
    static Buffer buffer = new Buffer();
    Packet[] packets = new Packet[Env.PACKET_NUM];

    //    Create 1000 packets when Sender called.
    public Sender() {
        for (int i = 0; i < Env.PACKET_NUM; i++) {
            packets[i] = new Packet(i);
        }
    }

    //    Put packets seq_base to next_seq_num in Pipeline and return pipeline.
//    Receiver.receivePipeline will receive Pipeline and check it`s order and something corrupted.
    public Pipeline sendPacket() throws InterruptedException {

        if (pipeline.nextSeqNum >= Env.PACKET_NUM) {
            pipeline.nextSeqNum = Env.PACKET_NUM;
            pipeline.setSize(pipeline.nextSeqNum - pipeline.base);
        }
        for (int i = pipeline.base; i < pipeline.nextSeqNum; i++) {
            if (i > Env.PACKET_NUM) System.out.println("ERR: Out Of Bount");
            if(!checkBuffer(packets[i].pktNum)&&!checkPipeline(packets[i].pktNum)) {
                packets[i].setPayload();
                packets[i].setSendTime();
                pipeline.add(packets[i]);
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return pipeline;
    }

    public boolean checkPipeline(int pktNum){
        if(pipeline.size() == 0) return false;
        for(Packet packet: pipeline){
            if(packet.pktNum==pktNum) return !packet.loss;
        }
        return false;
    }

    public boolean checkBuffer(int pktNum){
        if(buffer.size() == 0) return false;
        for(ACK ack: buffer){
            if(ack.pktNum==pktNum) return true;
        }
        return false;
    }

    public void removeBuffer(int pktNum){
        buffer.removeIf(ack -> ack.pktNum == pktNum);
    }

    public void rcvACK(Buffer rcv_buffer) {
        buffer = rcv_buffer;
        int i;
        for (i=0;i<buffer.size();i++) {
            if (buffer.size() == 0) break;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (buffer.get(i).rcvTime == 0)
                buffer.get(i).setRcvTime();
            System.out.println("sender.rcvACK.pkt_num: " + buffer.get(i).pktNum + " rcvTime: " + buffer.get(i).rcvTime);
        }
        for(i=0;i<pipeline.size();i++){
            if (checkBuffer(pipeline.base) && checkTime(pipeline.get(i).pktNum)) {
                removeBuffer(pipeline.base);
                pipeline.base++;
                pipeline.nextSeqNum++;
//                System.out.println("pipeline.base: "+pipeline.base+" pipeline.nextseqnum: "+pipeline.nextSeqNum);////////////////////////////////////
            } else {
                System.out.println();
                System.out.printf("---------- Packet Number %d Time Out ----------\n", pipeline.get(i).pktNum);
                System.out.println();
//                System.out.println("pipeline.base: "+pipeline.base+" pipeline.nextseqnum: "+pipeline.nextSeqNum);////////////////////////////////////
                return;
            }
        }
            System.out.println();
            System.out.println("---------- Packet Received Clearly -----------");
            System.out.println();

    }

    public boolean checkTime(int pktNum){
        long rcvTime = 0, sendTime = 0;
        for(ACK ack:buffer){
            if(ack.pktNum == pktNum) rcvTime = ack.rcvTime;
        }
        for(Packet packet:pipeline){
            if(packet.pktNum == pktNum) sendTime = packet.sendTime;
        }
        return (rcvTime - sendTime < 180);
    }
}

