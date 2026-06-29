import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for(int i = 0; i < n; i++) {

            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                System.out.println("Indices: " 
                    + map.get(complement) + ", " + i);
                found = true;
                break;
            }

            map.put(arr[i], i);
        }

        if(!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}