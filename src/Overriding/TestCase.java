package Overriding;

public class TestCase {
    public static void main(String[] args) {
        Mammal m = new Horse();
        Cattle c = new Horse();
        c.eat(m);
    }
}
