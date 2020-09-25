package dke.computernetwork.assingment1;

import java.util.LinkedList;

public class Pipeline extends LinkedList<Packet> {
    public int base = 0;
    public int next_seq_num = Env.MAX_SIZE;
    public int window_size = Env.MAX_SIZE;

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(Packet packet) {
        if(size() >= Env.MAX_SIZE) {
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


}
