package dke.computernetwork.assingment1;

import java.util.Random;

public class Packet {
    public int pkt_num;
    public boolean corrupt;
    public long send_time;
    Random rand = new Random();

    public Packet(int pkt_num){
        this.pkt_num = pkt_num;
    }

    //    Set corrupt probability and decide corrupted or not.
    public void setCorruptProb(){
        corrupt = (rand.nextDouble() <= .1);
    }
}
