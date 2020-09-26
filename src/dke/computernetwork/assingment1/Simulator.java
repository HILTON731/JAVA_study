package dke.computernetwork.assingment1;

public class Simulator {
    static Sender sender = new Sender();
    static Receiver receiver = new Receiver();

    public static void main(String[] args) {
        while (Receiver.pipeline.base < Env.PACKET_NUM) {
            Pipeline pktblk = sender.sendPacket();
            if (!receiver.receivePipeline(pktblk)) {
                System.out.println("ERR: Failed Sending Packet.");
            }
            CumulACK cumulACK = receiver.sendACK();
            sender.rcvACK(cumulACK);

//        Test Code
//        Check How Packet send in pipeline.
            for(Packet packet: pktblk){
                System.out.println("Sender.sendPacket().pipeline.pkt_num"+packet.pkt_num + " IsCorrupt: "+packet.corrupt); // Number of corrupted packet.
            }
            for (ACK ack : cumulACK) {
                System.out.println("receiver.sendACK.pkt_num: " + ack.pkt_num);
            }
            System.out.println("Sender.pipeline.base: " + Sender.pipeline.base);
            System.out.println("Sender.pipeline.next_seq_num: " + Sender.pipeline.next_seq_num);
        }

    }

}
