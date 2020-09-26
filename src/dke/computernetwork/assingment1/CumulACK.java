package dke.computernetwork.assingment1;

import java.util.LinkedList;

public class CumulACK extends LinkedList<ACK> {

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(ACK ack) {
        while(size() >= Sender.pipeline.window_size) {
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
