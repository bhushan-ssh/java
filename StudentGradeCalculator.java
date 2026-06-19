import java.util.Scanner;

class Student {

    String name;
    int math;
    int science;
    int english;

    Student(String name, int math, int science, int english) {
        this.name = name;
        this.math = math;
        this.science = science;
        this.english = english;
    }

    int calculateTotal() {
        return math + science + english;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    char calculateGrade() {

        double avg = calculateAverage();

        if (avg >= 90) {
            return 'A';
        } 
        else if (avg >= 75) {
            return 'B';
        } 
        else if (avg >= 60) {
            return 'C';
        } 
        else {
            return 'D';
        }
    }

    void display() {

        System.out.println("Student Name : " + name);
        System.out.println("Total Marks : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
        System.out.println("Grade : " + calculateGrade());

    }
}


public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Math Marks: ");
        int math = sc.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();


        Student student = new Student(
            name,
            math,
            science,
            english
        );


        student.display();


        sc.close();
    }
}