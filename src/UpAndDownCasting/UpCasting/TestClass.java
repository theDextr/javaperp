package UpAndDownCasting.UpCasting;

public class TestClass {
    public static void main(String[] args) {
        Car c = new Baleno();
//        c.name = "Genralized class";

        System.out.println(c instanceof Alto);
        Baleno a = (Baleno)c;
        System.out.println(a.fast());
        System.out.println(a.name);
    }
}
