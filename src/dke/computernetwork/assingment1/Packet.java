package dke.computernetwork.assingment1;

import java.util.Random;

public class Packet {
    public int pktNum;
    public boolean corrupt;
    public int sendTime = 0;
    Random rand = new Random();

    public Packet(int pktNum) {
        this.pktNum = pktNum;
    }

//    Set corrupt probability and decide corrupted or not.
    public void setPayload(int sendTime) {
        corrupt = (rand.nextDouble() <= .1);
        this.sendTime = sendTime;

    }

}
