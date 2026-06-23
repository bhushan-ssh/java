import java.util.Scanner;

class Book {

    String title;
    String author;
    boolean isIssued;


    Book(String title, String author) {

        this.title = title;
        this.author = author;
        this.isIssued = false;

    }


    void issueBook() {

        if(!isIssued) {

            isIssued = true;
            System.out.println("Book issued successfully");

        }
        else {

            System.out.println("Book already issued");

        }

    }


    void returnBook() {

        if(isIssued) {

            isIssued = false;
            System.out.println("Book returned successfully");

        }
        else {

            System.out.println("Book was not issued");

        }

    }


    void display() {

        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);

    }

}



public class LibraryManagement {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();


        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();



        Book book = new Book(title, author);



        System.out.println("\n1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();



        if(choice == 1) {

            book.issueBook();

        }
        else if(choice == 2) {

            book.returnBook();

        }
        else {

            System.out.println("Invalid choice");

        }



        book.display();
        sc.close();

    }
}