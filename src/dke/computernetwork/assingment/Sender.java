package dke.computernetwork.assingment;

import java.util.Random;

public class Sender {

    Random rand = new Random();
    public static Pipeline pipeline = new Pipeline();
    public static CumulativeACK cumulativeACK = new CumulativeACK();
    public Packet[] packets = new Packet[1000];

    public Sender(){
        for(int i = 0;i<1000;i++){
            packets[i] = new Packet(i);
        }
    }
    public void sendPacket(){
        for(int i = pipeline.seq_base; i<pipeline.next_seq_num;i++){
            isCorrupt(packets[i]);
            pipeline.add(packets[i]);
        }
        for(Packet packet: pipeline){
            System.out.println(packet.pkt_num + ": "+packet.corrupt); // Number of corrupted packet
        }
    }

    public void rcvAck(){
        int i;
        for(i = 1; i<cumulativeACK.size();i++){
            if(cumulativeACK.get(i).pkt_num != cumulativeACK.get(i-1).pkt_num + 1){
                pipeline.next_seq_num--;
//                ACK temp = cumulativeACK.get(i);
//                cumulativeACK.clear();
//                cumulativeACK.add(temp);
                break;
            } else {
                pipeline.removeFirst();
            }
            pipeline.seq_base++;
            pipeline.next_seq_num++;
        }

//        Packet tmp = pipeline.get()

        for(ACK ack: cumulativeACK)
            System.out.println("rcvACK: "+ack.pkt_num);
        System.out.println("seq_base in rcvACK: "+pipeline.seq_base);
        System.out.println("size of pipeline in rcvACK: "+pipeline.size());
        for(Packet ack: pipeline)
            System.out.println("Pipeline: "+ack.pkt_num +": "+ack.corrupt);

    }

    public void isCorrupt(Packet packet){
        packet.corrupt = (rand.nextDouble() <= .1);
    }
}
