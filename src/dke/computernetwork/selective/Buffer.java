package dke.computernetwork.selective;

import java.util.LinkedList;

public class Buffer extends LinkedList<ACK> {

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(ACK ack) {
        while (size() >= Sender.pipeline.windowSize) {
            removeFirst();
        }

        return super.add(ack);
    }

    @Override
    public void add(int index, ACK element) {
        super.add(index, element);
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
