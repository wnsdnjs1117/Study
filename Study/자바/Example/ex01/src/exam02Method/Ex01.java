package exam02Method;

public class Ex01 {
    int num1 =10;
    static int num3 = 30;
    final int num4 = 40;


    public static void main(String[] args) {
        Method01 me1 = new Method01(10,10);
        System.out.println(me1.num);
        Method01 me2 = new Method01(10,10);
        System.out.println(me2.num);
    }
}
