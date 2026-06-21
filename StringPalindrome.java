import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter String: ");
        String str = sc.nextLine();


        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

        }


        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);


        if(str.equalsIgnoreCase(reverse)) {

            System.out.println("String is Palindrome");

        } else {

            System.out.println("String is Not Palindrome");

        }


        sc.close();
    }
}