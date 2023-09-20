package OverLoading.OverLoadingConcept;

public class Person {

    public void drink(ThumsUp thumsUp) {
        System.out.println("Lets drink thumsUp");
    }

    public void drink(CocaCola cocaCola) {
        System.out.println("Let's drink cocacola");
    }

    public void drink(Signature signature) {
        System.out.println("Let's drink signature");
    }

    public void drink(Drink drink) {
        System.out.println("Let's drink some drink");
    }
}
