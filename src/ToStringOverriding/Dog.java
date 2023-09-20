package ToStringOverriding;

public class Dog {
    String name;
    String age;
    String breed;

    public Dog(String name, String age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Age : " + age + ", Breed : " + breed;
    }

    public static void main(String[] args) {
        Dog d= new Dog("Kasper", "3 years", "labrador");
        Dog d1= new Dog("Pluto", "6 Months", "DowerMan");
        Dog d2= new Dog("Kaiser", "2.5 years", "GermanShepard");

        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
    }
}
