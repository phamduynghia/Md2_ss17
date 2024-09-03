package bt14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        System.out.println("Enter numbers el in list 1: ");
        int n = Integer.parseInt(sc.nextLine());

        if (n <= 0) {
            throw new Exception("List 1 is empty");
        }
        for (int i = 0; i < n; i++) {
            list1.add(Integer.parseInt(sc.nextLine()));
        }
        int sum = 0, count = 0;

        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
            count++;
        }
        System.out.println("trung list1 la: " + (sum / count));
    }
}
