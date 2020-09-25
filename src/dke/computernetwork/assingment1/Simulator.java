package dke.computernetwork.assingment1;

public class Simulator {
    static Sender sender = new Sender();
    static Receiver receiver = new Receiver();

    public static void main(String[] args) {
        while (Sender.pipeline.base < Env.PACKET_NUM) {
            Pipeline pktblk = sender.sendPacket();
            if (!receiver.receivePipeline(pktblk)) {
                System.out.println("ERR: Failed Sending Packet.");
            }
            CumulACK cumulACK = receiver.sendACK();
            sender.rcvACK(cumulACK);

//        Test Code
            for (ACK ack : cumulACK)
                System.out.println(ack.pkt_num + ": cumulACK");
            System.out.println(cumulACK.rcv_base);
            System.out.println("simulator base: "+Sender.pipeline.base);
            System.out.println("simulator next_seq_num: "+Sender.pipeline.next_seq_num);
        }

    }

}
