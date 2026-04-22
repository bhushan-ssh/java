public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 120, original = num, rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}