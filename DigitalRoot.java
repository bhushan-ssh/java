import java.util.Scanner;

public class DigitalRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while(n >= 10) {
            int sum = 0;

            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        System.out.println("Digital Root = " + n);

        sc.close();
    }
}