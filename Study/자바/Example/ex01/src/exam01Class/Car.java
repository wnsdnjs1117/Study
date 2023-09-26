package exam01Class;

public class Car {

    int year;
    String carName = "소나타";

    public Car() {
    }
    public Car(int year, String carName) {
        this.year = year;
        this.carName = carName;
    }

    public void go(){
        System.out.println(carName +"이 출발합니다.");
    }
}
