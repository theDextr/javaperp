package DesignPattern;

public class Foreach {
    //passing variable argument to the method as it is accepting only integer type variable
    public static Long add(int...a) {
        long sum = 0l;
        for(int i: a) {
            sum = sum + i;
        } return sum;
    }

    public static void main(String[] args) {
        //calling add method inorder to get sum of the argument passed to the method
       Long sum = Foreach.add(10,01,98,01);
        System.out.println(sum);
    }
}
