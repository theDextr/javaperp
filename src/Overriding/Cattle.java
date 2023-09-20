package Overriding;

public class Cattle extends Mammal {
//    public  void eat(Cattle cattle) {
//        System.out.println("Cattle is eating grass.");
//    }

    @Override
    public void eat(Mammal mammal) {
        System.out.println("Cattle is eating grass.");
    }
}
