package ConstructorChaining.SameClass;

public class Bottle {
    String brandName;
    double capacity;
    int price;

    Bottle(String brand) {
        this(50);
        brandName =brand;
        System.out.println("BrandName constructor called");
    }
    Bottle(int price) {
        this.price = price;
        System.out.println("Price Constructor called");
    }
    Bottle(double capacity) {
       this("Milton Bottle");
       this.capacity = capacity;
        System.out.println("Capacity Constructor called");
    }
}
