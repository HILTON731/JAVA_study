package dke.computernetwork.assingment1;

import java.util.Random;

public class Sender {

    Random rand = new Random();
    static Pipeline pipeline = new Pipeline();
    static CumulACK cumulACK = new CumulACK();
    Packet[] packets = new Packet[Env.PACKET_NUM];

//    Create 1000 packets when Sender called.
    public Sender(){
        for(int i = 0;i<Env.PACKET_NUM;i++){
            packets[i] = new Packet(i);
        }
    }

//    Put packets seq_base to next_seq_num in Pipeline and return pipeline.
//    Receiver.receivePipeline will receive Pipeline and check it`s order and something corrupted.
    public Pipeline sendPacket(){
        for(int i = pipeline.base; i<pipeline.next_seq_num; i++){
            if(i > Env.PACKET_NUM) System.out.println("ERR: Out Of Bount");
            packets[i].setCorruptProb();
            pipeline.add(packets[i]);
        }
//        Debugging code.
//        Check How Packet send in pipeline.
        for(Packet packet: pipeline){
            System.out.println(packet.pkt_num + ": "+packet.corrupt); // Number of corrupted packet.
        }

        return pipeline;
    }

    public void rcvACK(CumulACK rcv_cumulACK){

        cumulACK = rcv_cumulACK;
//        for(int i = pipeline.base; i<cumulACK.rcv_base;i++){
//            pipeline.removeFirst();
//        }
        for(int i = 0; i<pipeline.window_size;i++){
            pipeline.removeFirst();
        }


        pipeline.base = cumulACK.rcv_base;
        pipeline.next_seq_num += cumulACK.rcv_base;
        if(pipeline.next_seq_num>Env.PACKET_NUM){
            pipeline.next_seq_num = Env.PACKET_NUM;
        }
        System.out.println("rcvACK next_seq_num: "+pipeline.next_seq_num);
    }



//    public void measureTime(Packet packet){
//        Timer timer = new Timer();
//        TimerTask task = new TimerTask(){
//
//            @Override
//            public void run() {
//                if(cumulACK.get)
//            }
//        }
//    }
}

