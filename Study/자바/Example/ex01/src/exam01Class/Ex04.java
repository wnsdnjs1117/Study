package exam01Class;

public class Ex04 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        int[] nums={1,10,12,8,7,14};
        int sum = Calc.sumArray(nums);
        Calc.printResult(sum);

    }
}
