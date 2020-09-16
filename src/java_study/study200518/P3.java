package java_study.study200518;

import java.util.Scanner;

public class P3 {
    private int volume = 0;
    private int channel = 0;
    public final static int MAX_VOLUME = 3;
    public final static int MAX_CHANNEL = 3;

    public void volumeUp() {
        if (volume < MAX_VOLUME)
            volume++;
        display();
    }

    public void volumeDown() {
        if (volume > 0)
            volume--;
        display();
    }

    public void channelUp() {
        if (channel < MAX_CHANNEL)
            channel++;
        display();
    }

    public void channelDown() {
        if (channel > 0)
            channel--;
        display();
    }

    public void display() {
        System.out.println("Volume = " + volume);
        System.out.println("Channel = " + channel);
    }

    public static void main(String[] args) {
        P3 remocon = new P3();
        Scanner sc = new Scanner(System.in);
        remocon.display();

        boolean end = false;
        int selection = 0;
        while (!end) {
            System.out.println("1: volume up.");
            System.out.println("2: volume down.");
            System.out.println("3: Channel up.");
            System.out.println("4: Channel down.");
            System.out.println("0: End.");
            System.out.print("Input your number: ");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    remocon.volumeUp();
                    break;
                case 2:
                    remocon.volumeDown();
                    break;
                case 3:
                    remocon.channelUp();
                    break;
                case 4:
                    remocon.channelDown();
                    break;
                default:
                    System.out.println("logout");
                    end = true;
            }
        }
    }
}
