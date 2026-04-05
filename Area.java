import java.util.*;

class rectangle {
   
        int w;
        int h;
        public void setw(int w) {
            this.w = w;
        }
        public void seth(int h) {
            this.h = h;
        }
        public int area() {
            return w * h;
        }
    }
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r = new rectangle();
        System.out.println("Enter the width of the rectangle:");
        r.setw(sc.nextInt());
        System.out.println("Enter the height of the rectangle:");
        r.seth(sc.nextInt());
        sc.close();
        System.out.println("The area of the rectangle is: " + r.area() +" " + "square units");
    }
}
