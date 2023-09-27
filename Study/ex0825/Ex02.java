package ex0825;


public class Ex02 {
    static int sum = 0;

    static class AddClass {
        public int add(int sum, int y) {

            Ex02.sum = sum + y;
            return sum;
        }
    }
}
