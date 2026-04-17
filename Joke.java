import java.util.Scanner;
public class Joke {


    
    static void TellJoke(int a) {
        switch (a) {
            case 0:
                System.out.println("Why did the scarecrow win an award?");
                System.out.println("Because he was outstanding in his field.");
                break;
            case 1:
                System.out.println("Why did the math book look sad?");
                System.out.println("Because it had too many problems.");
                break;
            case 2:
                System.out.println("Why was the big cat disqualified?");
                System.out.println("Because it was a cheetah.");
                break;
            default:
                System.out.println("I am not in mood to tell a joke");  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int a = sc.nextInt();
        sc.close();
        TellJoke(a);
    }
}
