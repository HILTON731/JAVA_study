package dke.computernetwork.assingment1;

public class Simulator {
    static Sender sender = new Sender();
    static Receiver receiver = new Receiver();

    //        Simulation Monitoring.
//        Check How Packet sent in pipeline.
    public static void main(String[] args) {
        System.out.println("---------- Simulation Start ----------");
        while (Receiver.pipeline.base < Env.PACKET_NUM) {
            Pipeline pktblk = sender.sendPacket();

            for (Packet packet : pktblk) {
                System.out.println("Sender.sendPacket().pipeline.pkt_num: " + packet.pktNum + " IsCorrupt: " + packet.corrupt + " SendTime: " + packet.sendTime); // Number of corrupted packet.
            }

            if (!receiver.receivePipeline(pktblk)) {
                System.out.println("ERR: Failed Sending Packet.");
            }
            CumulACK cumulACK = receiver.sendACK();

            for (ACK ack : cumulACK) {
                System.out.println("receiver.sendACK.pkt_num: " + ack.pktNum + " rcvTime: " + ack.rcvTime);
            }

            sender.rcvACK(cumulACK);
        }
        System.out.println("---------- Simulation Finished ----------");
    }
}
