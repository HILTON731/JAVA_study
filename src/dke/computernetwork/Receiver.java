package dke.computernetwork;

import java.util.concurrent.Callable;

public class Receiver extends Thread{
    Sender sender;
    Packet packet;
    ACK ack;
    boolean isin = false;

    public Receiver(Packet packet){
        this.packet = packet;
    }
    @Override
    public void run() {
        if (!packet.corrupt){
            sendACK();
        }
    }

    public void sendACK(){
        Sender.cumulativeACK.add(new ACK(packet.pkt_num));
        isin = true;
    }

    public boolean isACK(){
        return isin;
    }
}
