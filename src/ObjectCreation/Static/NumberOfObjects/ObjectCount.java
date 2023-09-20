package ObjectCreation.Static.NumberOfObjects;

public class ObjectCount {
    static int count = 0;

    public static void main(String[] args) {
        ObjectCount obj1 = new ObjectCount();
        obj1.count();
        ObjectCount obj2 = new ObjectCount();
        obj2.count();
        ObjectCount obj3 = new ObjectCount();
        obj3.count();
        System.out.println("Total number of Objects: "+ count);
    }
     void count() {
        count++;
    }
}
