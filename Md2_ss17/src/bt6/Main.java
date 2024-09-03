package bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number 2: ");
        int n2 = Integer.parseInt(sc.nextLine());

        try {
            int a = n1 / n2;
            System.out.println("Divine: " + a);
        } catch (Exception e) {
            System.err.println("Invalid output");
        }
    }
}