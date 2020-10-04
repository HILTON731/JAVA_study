package dke.computernetwork.selective;

public class Receiver {
    static Pipeline pipeline = new Pipeline();
    static Buffer buffer = new Buffer();

//    Receive Pipeline from Sender.
//    After receiving check pipeline that something corrupted or inorder packet.
    public boolean receivePipeline(Pipeline pipeline) throws InterruptedException {
        Receiver.pipeline = pipeline;
        checkOrder();
        return true;
    }

//    Check pipeline that received ordered and find corrupt packet.
//    Put cumulativeACK queue if everythings fine.
//    If inordered or corrupted packet found then collect in linkedlist detective.
//    Return success code if packets in pipeline clear or return first packet number which has problem.
    public void checkOrder() throws InterruptedException {
        for (Packet packet : pipeline) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!packet.loss) {
                buffering(packet);
            }
        }
    }


    public void buffering(Packet packet){
        packet.inBuffer = true;
        for(int j = 0; j < buffer.size();j++){
            if(buffer.get(j).pktNum > packet.pktNum){
                buffer.add(j, new ACK(packet.pktNum));
                return;
            } else if(buffer.get(j).pktNum == packet.pktNum) {
                return;
            }
        }
        buffer.add(new ACK(packet.pktNum));
    }
    //    Send cumualtiveACK queue by response.
    public Buffer sendACK() {
        return buffer;
    }
}
