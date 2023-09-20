package Overriding;

public class Horse extends Cattle {
//    public void eat(Horse horse) {
//        System.out.println("Horse is also eating grass.");
//    }

    @Override
    public void eat(Mammal mammal) {
        System.out.println("Horse is also eating grass.");
    }
}
