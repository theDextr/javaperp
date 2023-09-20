package OverLoading.OverLoadingConcept;

public class TestCase {
    public static void main(String[] args) {
       ThumsUp thumsUp = new ThumsUp();
       Drink drink = new Signature();
       Person p = new Person();
       p.drink(thumsUp);
       //overloading of methods depend on the type of reference passed
       p.drink(drink);
    }
}
