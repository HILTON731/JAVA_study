package dke.computernetwork.assingment;

import java.util.LinkedList;

public class Pipeline extends LinkedList<Packet> {
    public int base = 0;
    public int nextSeqNum = Env.MAX_SIZE;
    public int windowSize = Env.MAX_SIZE;

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(Packet packet) {
        while (size() >= windowSize) {
            removeFirst();
        }
        return super.add(packet);
    }

    @Override
    public Packet getFirst() {
        return super.getFirst();
    }

    @Override
    public Packet removeFirst() {
        return super.removeFirst();
    }

    public void setSize(int window_size) {
        this.windowSize = window_size;
    }


}
