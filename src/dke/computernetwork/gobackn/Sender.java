package dke.computernetwork.gobackn;

public class Sender {

    static Pipeline pipeline = new Pipeline();
    static CumulACK cumulACK = new CumulACK();
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
            packets[i].setPayload();
            packets[i].setSendTime();
            pipeline.add(packets[i]);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return pipeline;
    }

    public void rcvACK(CumulACK rcv_cumulACK) {
        cumulACK = rcv_cumulACK;
        int i;

        for (i = 0; i < cumulACK.size(); i++) {
            try {
                Thread.sleep(1);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            cumulACK.get(i).setRcvTime();
            if (pipeline.get(i).pktNum == cumulACK.get(i).pktNum && cumulACK.get(i).rcvTime - pipeline.get(i).sendTime <= 160) {
                pipeline.base++;
                pipeline.nextSeqNum++;
            } else {
                break;
            }
        }
        if (i == cumulACK.size()) {
            System.out.println();
            System.out.println("---------- Packet Received Clearly -----------");
            System.out.println();
        } else {
            System.out.println();
            System.out.printf("---------- Packet Number %d Time Out ----------\n", pipeline.get(i).pktNum);
            System.out.println();
        }
    }
}

