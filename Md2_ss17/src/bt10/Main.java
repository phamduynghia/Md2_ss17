package bt10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = Double.parseDouble(sc.nextLine());

        if (radius < 0) {
            throw new Exception("radius can not be < 0");
        }

        System.out.println("Area of circle with radius " + radius + " is: " + (Math.PI * radius * radius));
    }
}
