package JAVA_book.chap9.LocalClass;

import dke.computernetwork.assingment.Packet;

import java.util.Random;

public class temp {
    Random rand = new Random();
    static Packet[] packet = new Packet[10];

    public static void main(String[] args) {
        for(int i =0 ;i<10;i++){
            packet[i] = new Packet(i);
        }
        for(Packet pkt: packet){
            System.out.println(pkt.corrupt);
        }
        for(Packet pkt: packet){
            System.out.println(pkt.corrupt);
        }
    }
}
