package dke.computernetwork.assingment1;

import java.util.LinkedList;

public class Receiver {
    static Pipeline pipeline = new Pipeline();
    static CumulACK cumulACK = new CumulACK();

//    Receive Pipeline from Sender.
//    After receiving check pipeline that something corrupted or inorder packet.
    public boolean receivePipeline(Pipeline pipeline){
        Receiver.pipeline = pipeline;
        checkOrder();
        return true;
    }

//    Check pipeline that received ordered and find corrupt packet.
//    Put cumulativeACK queue if everythings fine.
//    If inordered or corrupted packet found then collect in linkedlist detective.
//    Return success code if packets in pipeline clear or return first packet number which has problem.
    public void checkOrder(){
        int rcv_base = pipeline.base;
        LinkedList<Integer> detective = new LinkedList<>();

        for(int i = 0; i<pipeline.size(); i++){

            if (rcv_base == pipeline.get(i).pkt_num && !(pipeline.get(i).corrupt)){
                cumulACK.add(new ACK(pipeline.get(i).pkt_num));
                pipeline.base++;
            } else {
                detective.add(rcv_base);
            }
            rcv_base++;

        }
//        pipeline.clear();
        if(!detective.isEmpty()) {
            pipeline.base = detective.get(0)-1;
            System.out.println(detective.getFirst() + " getFirst " + pipeline.base + " pipeline.base");
        }
        detective.clear();
    }

//    Send cumualtiveACK queue by response.
    public CumulACK sendACK(){
        cumulACK.rcv_base = pipeline.base;
//        CumulACK tmp = cumulACK;
//        cumulACK.clear();
        return cumulACK;
    }
}
