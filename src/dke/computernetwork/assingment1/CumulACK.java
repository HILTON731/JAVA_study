package dke.computernetwork.assingment1;

import java.util.LinkedList;

public class CumulACK extends LinkedList<ACK> {
    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(ACK ack) {
        if(size() >= Env.MAX_SIZE) {
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
