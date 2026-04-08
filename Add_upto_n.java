import java.util.Scanner;






public class Add_upto_n{
     public static int add(int n){

        int termSum = 0;
        for (int i = 1; i <= n; i++) {
            
            // Sum the squares from 1^2 to i^2
            for (int j = 1; j <= i; j++) {
                termSum += j * j;
            }
        }
        return termSum;
    }

     
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        // Taking  input
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        System.out.println("The sum of squares upto " + n + " is " + add(n));
        // Calling the add method
        



        scanner.close();
    }
}
