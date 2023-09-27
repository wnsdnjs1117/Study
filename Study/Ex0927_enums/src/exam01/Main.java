package exam01;
public class Main {
    public static void main(String[] args) {
        System.out.println(Direction.EAST);
        Direction[] dArr = Direction.values();
        new Unit().init("dd");
        for(Direction d : dArr) {
            System.out.printf("%s = %d%n", d.name(), d.ordinal());
        }
    }
}
