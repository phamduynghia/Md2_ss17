package bt8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so");
        int n = Integer.parseInt(sc.nextLine());
        if (n >= 1 && n <= 2) {
            throw new Exception("loi");
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                throw new Exception("ko phai so nguyen to");
            }
        }
        System.out.println("la so nguyen to");

    }
}
