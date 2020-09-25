package dke.computernetwork.assingment;

public class Simulator {
    static Sender sender;
    static Receiver[] receiver;
    static ACK[] acks;

    public static void main(String[] args) throws InterruptedException {
        sender = new Sender();


        while(Sender.pipeline.next_seq_num <= 1000) {
            sender.sendPacket();
//            Sender.pipeline.window_size =Sender.pipeline.next_seq_num - Sender.pipeline.seq_base;
            receiver = new Receiver[Sender.pipeline.window_size];
            System.out.println("Simulator pipeline size: "+Sender.pipeline.size());
            for (int i = 0; i < Sender.pipeline.window_size; i++) {
                receiver[i] = new Receiver(Sender.pipeline.get(i));
                receiver[i].setPriority(Thread.MAX_PRIORITY - i);
                receiver[i].start();
                receiver[i].join();
            }
            System.out.println("cumulativeACK size: " + Sender.cumulativeACK.size());
            sender.rcvAck();
        }

    }

}
