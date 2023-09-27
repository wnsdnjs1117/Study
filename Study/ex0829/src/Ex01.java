
import java.util.ArrayList;

class Covariance {
    public static void main(String[] args) {
        // 공변성 (제네릭 업캐스팅)
        ArrayList<? extends Object> covariance = new ArrayList<Integer>();
        // 반공변성 (제네릭 다운캐스팅)
        ArrayList<? super Integer> contravariance = new ArrayList<Object>();
    }
}