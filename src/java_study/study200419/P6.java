package java_study.study200419;

public class P6 {
    public static void main(String[] args) {
        System.out.println("distinct 메소드 테스트 -----------");

        int[] a2 = {1, 1, 2};
        System.out.println("a2 = {1, 1, 2}");
        System.out.println("distinct(a2, a2.length): "+distinct(a2, a2.length));
        System.out.println("distinct(a2, 0): "+distinct(a2, 0));
        System.out.println("distinct(a2, a2.length + 1): "+distinct(a2, a2.length + 1));

    }
    public static void fillRandom(int[] list, int max){
        for(int i=0;i<list.length;i++){
            list[i]=(int)(max*Math.random()+1);
        }
    }
    public static boolean distinct(int[] a,int n){
        if(n<1){
            System.out.println("n >= 1 이어야 합니다.");
            return true;
        } else if(n>a.length) n = a.length;

        boolean isDistinct = true;

        for(int i=n-1;i>=1;i--){
            int temp = a[i];
            for(int j=0;j<i;j++){
                if(a[j]==temp){
                    isDistinct = false;
                    break;
                }
            }
        }
        return isDistinct;
    }
    public static void fillRandomDistinct(int[] list, int max){
        if(max < list.length ||max < 1){
            System.out.println("max >= list.length 이고 max >= 1 이어야 합니다.");
            System.out.println("배열에 아무 것도 채우지 않았습니다.");
            return;
        }
        int count =0;
        while(count<list.length){
            int number = (int)(max*Math.random())+1;
            for(int i=0;i<count;i++) {
                if (list[i] == number) {
                    number = 0;
                    break;
                }
            }
            if(number!=0){
                list[count++]=number;
            }
        }
    }
    public static int[] makeRandomArray(int n, int max){
        if(n>=0&&max>=1) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (max * Math.random() + 1);
            }
            return array;
        }else
            return null;
    }

}
