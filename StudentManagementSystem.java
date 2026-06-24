import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public int getMarks() {
        return marks;
    }
}


public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }


        System.out.println("\nStudent Details:");

        int total = 0;

        for(Student s : students) {

            s.display();
            total += s.getMarks();
            System.out.println();
        }


        double avg = (double) total / students.size();

        System.out.println("Average Marks: " + avg);

        sc.close();
    }
}