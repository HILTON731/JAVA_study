package dke.computernetwork.gobackn;

public class Receiver {
    static Pipeline pipeline = new Pipeline();
    static CumulACK cumulACK = new CumulACK();

//    Receive Pipeline from Sender.
//    After receiving check pipeline that something corrupted or inorder packet.
    public boolean receivePipeline(Pipeline pipeline) throws InterruptedException {
        cumulACK.clear();
        Receiver.pipeline = pipeline;
        checkOrder();
        return true;
    }

//    Check pipeline that received ordered and find corrupt packet.
//    Put cumulativeACK queue if everythings fine.
//    If inordered or corrupted packet found then collect in linkedlist detective.
//    Return success code if packets in pipeline clear or return first packet number which has problem.
    public void checkOrder() throws InterruptedException {
        int lastSuccNum = -1;
        boolean outOfOrder = true;
        for (int i = 0; i < pipeline.size(); i++) {
            try {
                Thread.sleep(1);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            if((outOfOrder = outOfOrder && !pipeline.get(i).loss)) {
                lastSuccNum = pipeline.get(i).pktNum;
                cumulACK.add(new ACK(pipeline.get(i).pktNum));
            } else if(!pipeline.get(i).loss){
                cumulACK.add(new ACK(lastSuccNum));
            }
        }
    }

    //    Send cumualtiveACK queue by response.
    public CumulACK sendACK() {
        return cumulACK;
    }
}
