package dke.computernetwork.assingment1;

public class Receiver {
    static Pipeline pipeline = new Pipeline();
    static CumulACK cumulACK = new CumulACK();

//    Receive Pipeline from Sender.
//    After receiving check pipeline that something corrupted or inorder packet.
    public boolean receivePipeline(Pipeline pipeline) {
        cumulACK.clear();
        Receiver.pipeline = pipeline;
        checkOrder();
        return true;
    }

//    Check pipeline that received ordered and find corrupt packet.
//    Put cumulativeACK queue if everythings fine.
//    If inordered or corrupted packet found then collect in linkedlist detective.
//    Return success code if packets in pipeline clear or return first packet number which has problem.
    public void checkOrder() {
        for (int i = 0; i < pipeline.size(); i++) {

            pipeline.get(i).sendTime ++;

            if (pipeline.base == pipeline.get(i).pktNum && !(pipeline.get(i).corrupt)) {
                cumulACK.add(new ACK(pipeline.get(i).pktNum, pipeline.get(i).sendTime + 1));
            }
            pipeline.base++;
        }
        for (int i = 0; i < cumulACK.size(); i++) {
            if (pipeline.base != cumulACK.get(i).pktNum) {
                pipeline.base = pipeline.base + i - pipeline.size();
                break;
            }

        }
    }

    //    Send cumualtiveACK queue by response.
    public CumulACK sendACK() {
        return cumulACK;
    }
}
