package bt2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of array elements:");
        int n = Integer.parseInt(sc.nextLine());
        if(n!=0){
            for (int i = 0; i < n; i++) {
                System.out.println("enter: ");
                arr.add(Integer.parseInt(sc.nextLine()));
            }
        }
        if (arr.isEmpty())throw new Exception("Hihihi");
        int max = arr.getFirst();
        for (Integer integer : arr) {
            if (integer > max) max = integer;
        }
        System.out.println("max: "+max);
    }
}