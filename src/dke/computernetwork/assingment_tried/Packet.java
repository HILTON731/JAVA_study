package dke.computernetwork.assingment_tried;

import java.util.Random;

public class Packet {
    public int pkt_num;
    public Boolean corrupt;
    static Random rand = new Random();

    public Packet(int pkt_num){
        this.pkt_num = pkt_num;
    }
}