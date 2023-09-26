package exam01Class;

public class MathCalc {
    static double pi = 3.14;
    int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        MathCalc.pi = pi;
    }

    void print(double result){
        System.out.println("결과"+result);
        this.num=20;

    }
}
