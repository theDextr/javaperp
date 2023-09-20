package DesignPattern;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0;i <=2;i++) {
            for (int j=0;j <=2;j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("------Next Pattern-----");

        for (int i=0;i <=2;i++) {
            for (int j=0;j<=2;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
