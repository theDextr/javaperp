package Collections.LinkedList;

import java.util.LinkedList;

public class Person {
    void purchase() {
        BigBazar big = new BigBazar();
        LinkedList<String> optionsToBuy = big.sell();
        System.out.println("Things we can buy in BigBazar are:");
        System.out.println(optionsToBuy);
    }
}
