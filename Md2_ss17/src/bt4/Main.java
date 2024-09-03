package bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer");
        List<Integer> list = new ArrayList<Integer>();

        String str = "abc123";
        String[] strs = str.split("");

        int n = Integer.parseInt(sc.nextLine());
        for (String s : strs) {
            try {
                list.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                list.add(0);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
