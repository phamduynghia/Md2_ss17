package bt9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = Integer.parseInt(sc.nextLine());

        if (n <= 0) {
            throw new Exception("not fibonacci");
        }
        // Bước 3: Tính số Fibonacci thứ n
        int fib = fibonacciIterative(n);

        // Bước 4: Hiển thị kết quả
        System.out.println("Số Fibonacci thứ " + n + " là: " + fib);

    }

    public static int fibonacciIterative(int n) {
        if (n == 1) {
            return 0; // Số Fibonacci thứ 1 là 0
        }
        if (n == 2) {
            return 1; // Số Fibonacci thứ 2 là 1
        }

        int fib = 1;
        int prevFib = 0;

        for (int i = 3; i <= n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
}