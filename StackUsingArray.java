import java.util.Scanner;

public class StackUsingArray {

    static int[] stack = new int[5];
    static int top = -1;

    static void push(int value) {

        if(top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed");
    }


    static void pop() {

        if(top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(stack[top] + " removed");
        top--;
    }


    static void peek() {

        if(top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Top element: " + stack[top]);
        }
    }


    static void display() {

        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");

        for(int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();


            switch(choice) {

                case 1:
                    System.out.print("Enter value: ");
                    push(sc.nextInt());
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}