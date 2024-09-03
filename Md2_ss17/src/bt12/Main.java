package bt12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number 2");
        int n2 = Integer.parseInt(sc.nextLine());

        if (n1 == 0 && n2 == 0) {
            throw new Exception("n1 and n2 is 0");
        }

        int gcd = findUCLN(n1, n2);
        System.out.println("Ước chung lớn nhất (UCLN) của " + n1 + " và " + n2 + " là: " + gcd);
    }

    public static int findUCLN(int a, int b) {
        // Sử dụng thuật toán Euclid để tìm UCLN
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Đảm bảo UCLN là số dương
    }
}