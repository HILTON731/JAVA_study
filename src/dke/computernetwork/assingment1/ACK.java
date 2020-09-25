package dke.computernetwork.assingment1;



public class ACK {
    public int pkt_num = -1;
    public long rcv_time = 0;
    public ACK(int pkt_num){
        this.pkt_num = pkt_num;
        rcv_time = System.currentTimeMillis();
    }
}
