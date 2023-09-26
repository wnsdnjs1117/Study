public class MyCar {
    private int price;
    private String myName;

    public MyCar(String myName, int price) {    // 생성자
        this.myName = myName;
        this.price = price;
    }

    public String getInfo() {   // MyCar의 정보 받아오기
        String str = "차량 : " + myName + ", 가격 : " + price;
        return str;
    }

    public class Promotion { // 인스턴스 클래스
        public int discount(){ // 할인율 구하기
            int discount = 0;
            discount = price / 100;
            return discount;
        }
    }
}
