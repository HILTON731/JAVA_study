package dke.computernetwork.assingment;


public class ACK {
    public int pktNum = -1;
    public int rcvTime = 0;

    public ACK(int pktNum, int rcvTime) {
        this.pktNum = pktNum;
        this.rcvTime = rcvTime;
    }
}
