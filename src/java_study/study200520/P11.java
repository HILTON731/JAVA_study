package java_study.study200520;

public class P11 {
    String str;
    P10 counter;

    public P11(String s){
        str = s;
        counter = new P10();
    }
    public boolean balanced(){
        for(int i = 0; i< str.length();i++){
            if(str.charAt(i)=='(')
                counter.countUp();
            else if(str.charAt(i)==')')
                counter.countDown();
        }
        int count = counter.getValue();
        counter.reset();

        if(count==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String[] strings = {"((hello)(goodbye))",
        "((a)(b)(())",
        "(a))b("};
        for(int i = 0;i<strings.length;i++){
            P11 tester = new P11(strings[i]);

            if(tester.balanced())
                System.out.println(strings[i]+"는 괄호가 짝이 맞습니다");
            else
                System.out.println(strings[i]+"는 괄호가 짝이 맞지 않습니다.");
        }
    }
}
