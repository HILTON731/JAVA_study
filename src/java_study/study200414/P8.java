package java_study.study200414;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class P8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for(int i =0 ; i<10; i++){
            a[i] = (int)(Math.random()*10);
            b[i] = (int)(Math.random()*10);
            c[i] = a[i]+b[i];
        }
        printArray(a);
        printArray(b);
        printArray(c);
    }

    private static void printArray(int[] c) {
        for(int i =0;i<c.length;i++)
            System.out.printf("%d ",c[i]);
        System.out.println();
    }
}
