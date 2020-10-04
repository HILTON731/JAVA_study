package dke.computernetwork.selective;

public class Simulator {
    static Sender sender = new Sender();
    static Receiver receiver = new Receiver();
    static int step = 0;

    //        Simulation Monitoring.
//        Check How Packet sent in pipeline.
    public static void main(String[] args) throws InterruptedException {
            System.out.println("---------- Simulation Start ----------");
            while (Receiver.pipeline.base < Env.PACKET_NUM) {
                System.out.println("########## Step " + step + " ##########");
                System.out.println();

                Pipeline pktblk = sender.sendPacket();

                System.out.println("## Sender send packet ##");
                for (Packet packet : pktblk) {
                    if (!packet.inBuffer)
                        System.out.println("sender.sendPacket().pipeline.pkt_num: " + packet.pktNum + " IsLoss: " + packet.loss + " SendTime: " + packet.sendTime); // Number of corrupted packet.
                }

//            1/2 RTT
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println();

                if (!receiver.receivePipeline(pktblk)) {
                    System.out.println("ERR: Failed sending packet.");
                }
                System.out.println("## Receiver get packet that sender sent ##");
                for (Packet packet : Receiver.pipeline) {
                    if (packet.inBuffer && !packet.loss)
                        System.out.println("receiver.rcvPacket().pipeline.pkt_num: " + packet.pktNum + " IsLoss: " + packet.loss + " rcvTime: " + System.currentTimeMillis()); // Number of corrupted packet.
                }

                System.out.println();

                Buffer buffer = receiver.sendACK();

                System.out.println("## Receiver check packet and send ACK to sender ##");
                for (ACK ack : buffer) {
                    System.out.println("receiver.sendACK.pkt_num: " + ack.pktNum + " sndTime: " + ack.rcvTime);
                }

//            1/2 RTT
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println();

                System.out.println("## Sender receive ACK and check every packet sent clear ##");
                sender.rcvACK(buffer);
                System.out.println();
                step++;
            }
            System.out.println("---------- Simulation Finished ----------");
    }
}
