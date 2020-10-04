package dke.computernetwork.gobackn;


public class ACK {
    public int pktNum = -1;
    public long rcvTime = 0;

    public ACK(int pktNum) {
        this.pktNum = pktNum;
        setRcvTime();
    }
    public void setRcvTime(){
        rcvTime = System.currentTimeMillis();
    }
}
