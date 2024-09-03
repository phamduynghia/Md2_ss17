package bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter number 1: ");
        do {
            try {
                int n1 = Integer.parseInt(sc.nextLine());
                a = n1;
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number value");
            }
        } while (true);
        System.out.println("Enter number 2: ");
        do {
            try {
                int n2 = Integer.parseInt(sc.nextLine());
                b = n2;
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number value");
            }
        } while (true);

        if (a < b) {
            System.out.println(b + " bigger than " + a);
        } else {
            System.out.println(a + " bigger than " + b);
        }
    }
}
