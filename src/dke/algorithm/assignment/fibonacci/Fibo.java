package dke.algorithm.assignment.fibonacci;

public class Fibo {
    static int[] array = new int[]{10, 20, 50, 100};

    public static void main(String[] args) {
        double start, end;
        for (int i : array) {
            start = System.currentTimeMillis();
            System.out.println("refibonacci(" + i + "): " + refibonacci(i));
            end = System.currentTimeMillis();
            System.out.println("refibonacci(" + i + "): " + (end - start) / 1000.0 + "sec");
        }
        for (int i : array) {
            start = System.currentTimeMillis();
            System.out.println("fibonacci(" + i + "): " + fibonacci(i));
            end = System.currentTimeMillis();
            System.out.println("fibonacci(" + i + "): " + (end - start) / 1000.0 + "sec");
        }

    }

    public static long fibonacci(int num) {
        if (num < 2)
            return num;
        else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static long refibonacci(int num) {
        long temp, cur=1, before=0;
        if (num<2) return num;
        for(int i = 1; i<num; i++){
            temp = cur;
            cur = before + cur;
            before = temp;
        }
        return cur;

//        long [] temp = new long[num + 1];
//        temp[0] = 0;
//        temp[1] = 1;
//        if (num < 2) {
//            return num;
//        }
//        for (int i = 2; i < num + 1; i++)
//            temp[i] = temp[i - 1] + temp[i - 2];
//        return temp[num];
    }
}
