public class MycarMain {
    public static void main(String[] args) {
        MyCar mycar = new MyCar("현대",10_000_000);
        MyCar.Promotion promotion= mycar.new Promotion();
        System.out.println(mycar.getInfo()+", 할인금액 : "+promotion.discount());

    }
    static String a="aa";
    static final int b = 1;
}
