package dke.computernetwork.assingment_tried;

import java.util.LinkedList;

public class CumulativeACK extends LinkedList<ACK> {

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(ACK ack) {
        if(size() >= Env.MAX_SIZE) {
//            System.out.println("remove pkt "+getFirst().pkt_num+" in cumulativeACK");
            removeFirst();
        }
        return super.add(ack);
    }

    @Override
    public ACK getFirst() {
        return super.getFirst();
    }

    @Override
    public ACK removeFirst() {
        return super.removeFirst();
    }


}
