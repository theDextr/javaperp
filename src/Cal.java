import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to perform ADD or SUB operation");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("add")) {
            System.out.println("Enter numbers to add");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println(n1 + n2);
        } else if (input.equalsIgnoreCase("sub")) {
            System.out.println("Enter numbers to sub");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println(n1 - n2);
        } else {
            System.out.println("You have entered a wrong Input");
        }
    }
}
