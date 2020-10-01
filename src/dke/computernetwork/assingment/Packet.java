package dke.computernetwork.assingment;

import java.util.Random;

public class Packet {
    public int pktNum;
    public boolean loss;
    public long sendTime = 0;
    Random rand = new Random();

    public Packet(int pktNum) {
        this.pktNum = pktNum;
    }

//    Set corrupt probability and decide corrupted or not.
    public void setPayload() {
        loss = (rand.nextDouble() <= .1);
    }

    public void setSendTime(){
        sendTime = System.currentTimeMillis();

    }

}
