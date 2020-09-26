package dke.computernetwork.assingment_tried;



public class ACK {
    public int pkt_num = 0;
    public long time = 0;
    public ACK(int pkt_num){
        this.pkt_num = pkt_num;
        time = System.currentTimeMillis();
    }
}
