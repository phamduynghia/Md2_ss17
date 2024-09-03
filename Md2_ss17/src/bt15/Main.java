package bt15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập vào 3 cạnh của tam giác
            System.out.print("Nhập cạnh thứ nhất: ");
            double side1 = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double side2 = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double side3 = scanner.nextDouble();

            // Kiểm tra điều kiện hợp lệ của tam giác
            checkTriangleValidity(side1, side2, side3);

            System.out.println("Các cạnh nhập vào tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkTriangleValidity(double side1, double side2, double side3) throws IllegalTriangleException {
        // Kiểm tra nếu có cạnh nào âm
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh của tam giác phải là số dương.");
        }

        // Kiểm tra điều kiện tổng 2 cạnh không lớn hơn cạnh còn lại
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh của tam giác phải lớn hơn cạnh còn lại.");
        }
    }
}
