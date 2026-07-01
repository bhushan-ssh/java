import java.util.Scanner;

public class QueueUsingArray {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;


    static void enqueue(int value) {

        if(rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if(front == -1) {
            front = 0;
        }

        queue[++rear] = value;

        System.out.println(value + " added");
    }


    static void dequeue() {

        if(front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(queue[front] + " removed");
        front++;
    }


    static void peek() {

        if(front == -1 || front > rear) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Front element: " + queue[front]);
        }
    }


    static void display() {

        if(front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");

        for(int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();


            switch(choice) {

                case 1:
                    System.out.print("Enter value: ");
                    enqueue(sc.nextInt());
                    break;

                case 2:
                    dequeue();
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