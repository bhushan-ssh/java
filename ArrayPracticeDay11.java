import java.util.Scanner;

public class ArrayPracticeDay11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 25, 30, 45, 50};

        System.out.println("Array Elements:");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        // Sum of array
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);



        // Maximum number
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);



        // Minimum number
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);



        // Even Odd count
        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }


        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);



        // Reverse Array
        System.out.println("Reverse Array:");

        for(int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


        sc.close();
    }
}