package exam02Method;

public class Method01 {
    int num;
    public Method01(int x, int y) {
        this.num = x+y;
    }
    public Method01(int x, int y,int z){
        this(x,y);
        this.num += z;
    }
}
