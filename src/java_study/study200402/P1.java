package java_study.study200402;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        printMenu();
        int num = inputNum();
        switch(num){
            case 1:
                printIceCreamMenu();
                break;
            case 2:
                printCoffeeCreamMenu();
                break;
            case 3:
                printDrinkMenu();
                break;
            case 4:
                System.out.println("감사합니다. 거래를 종료합니다.");
                System.exit(-1);
            default:

        }
    }
    public static void printMenu(){
        while(true){
            System.out.println("아이스크림, 커피, 음료를 파는 자판기입니다.");
            System.out.println();
            System.out.println("어떤 종류를 원하십니까?.");
            System.out.println("아이스크림:\t1");
            System.out.println("커피:\t2");
            System.out.println("음료:\t3");
            System.out.println("종료:\t4");
            System.out.print("번호 선택: ");
            int num = inputNum();
            switch(num){
                case 1:
                    printIceCreamMenu();
                    return;
                case 2:
                    printCoffeeCreamMenu();
                    return;
                case 3:
                    printDrinkMenu();
                    return;
                case 4:
                    System.out.printf("%d 선택, 감사합니다.",num);
                    System.exit(-1);
                default:
                    System.out.println("잘못된 번호 선택!");
                    break;
            }
        }
    }
    public static void printIceCreamMenu(){
        while(true) {
            System.out.println("무엇을 드시겠습니까?.");
            System.out.println("바닐라 아이스크림(1000원):\t1");
            System.out.println("아몬드 아이스크림(1400원):\t2");
            System.out.println("딸기 아이스크림(1400원):\t3");
            System.out.println("호두 아이스크림(1400원):\t4");
            System.out.print("번호 선택: ");
            int num = inputNum();
            outputChoice(num);
        }

    }
    public static void printCoffeeCreamMenu(){
        while(true){
            System.out.println("무엇을 드시겠습니까?.");
            System.out.println("아메리카노(1000원):\t1");
            System.out.println("카페라떼(1400원):\t2");
            System.out.println("에스프레소(1400원):\t3");
            System.out.println("아포가토(1500원):\t4");
            System.out.print("번호 선택: ");
            int num = inputNum();
            outputChoice(num);
        }

    }
    public static void printDrinkMenu(){
        while(true){
            System.out.println("무엇을 드시겠습니까?.");
            System.out.println("생수(1000원):\t1");
            System.out.println("오렌지쥬스(1400원):\t2");
            System.out.println("망고쥬스(1400원):\t3");
            System.out.println("우유(1400원):\t4");
            System.out.printf("번호 선택: ");
            int num = inputNum();
            outputChoice(num);
        }

    }
    public static int inputNum(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
    public static void outputChoice(int num){
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.printf("%d 선택, 감사합니다.",num);
                System.exit(0);
            default:
                System.out.println("잘못된 번호 선택!");
                break;
        }
    }
}
