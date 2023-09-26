package exam01Class;

public class Ex01 {
    public static void main(String[] args) {
        Object car = new Car(20,"제네시스");
        ((Car) car).go();
    }
}
