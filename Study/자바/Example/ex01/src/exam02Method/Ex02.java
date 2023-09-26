package exam02Method;

class Parent{}
class Child extends Parent{}

public class Ex02 {
    Parent p1 = new Parent();
    Child c1 = new Child();
    Parent p2 = new Child();
    Parent p3 = c1;
    Child c2 = (Child) new Parent();

}
