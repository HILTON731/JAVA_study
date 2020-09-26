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

        if(pipeline.next_seq_num >= Env.PACKET_NUM){
            pipeline.next_seq_num = Env.PACKET_NUM;
            pipeline.setSize(pipeline.next_seq_num - pipeline.base);
        }
        for(int i = pipeline.base; i<pipeline.next_seq_num; i++){
            System.out.println(i);
            if(i > Env.PACKET_NUM) System.out.println("ERR: Out Of Bount");
            packets[i].setCorruptProb();
            pipeline.add(packets[i]);
        }
        System.out.println(pipeline.size());
        return pipeline;
    }

    public void rcvACK(CumulACK rcv_cumulACK){

        cumulACK = rcv_cumulACK;

        for(int i = 0; i < cumulACK.size(); i++){
            if(pipeline.get(i).pkt_num == cumulACK.get(i).pkt_num){
                pipeline.base++;
                pipeline.next_seq_num++;
            } else {
                break;
            }
        }
    }

    public void Timer(){}
}

