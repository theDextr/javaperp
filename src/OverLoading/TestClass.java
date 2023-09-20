package OverLoading;

public class TestClass {
    public static void main(String[] args) {
        Son s = new Son();
        s.drink(new Water(), new Signature());
    }
}
