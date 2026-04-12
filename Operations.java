import java.util.Scanner;


public class Operations {

    static int add(int a , int b)
    {return a+b; }
    static int subs(int a , int b)
    {return a-b; }
    static int mul(int a , int b)
    {return a*b; }
    static int div(int a , int b)
    {return a/b; }
    static int mod(int a , int b)
    {return a%b; }
    

    
    
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int a = sc.nextInt();
       System.out.println("enter another number");
       int b = sc.nextInt();
       sc.close();


       System.out.println("the Addition is     ===>"+add(a,b));
       System.out.println("the Substraction is ===>"+subs(a,b));
       System.out.println("the Product is      ===>"+mul(a,b));
       System.out.println("the Division is     ===>"+div(a,b));
       System.out.println("the Remainder is    ===>"+mod(a,b));
    }
}
