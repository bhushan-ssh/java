public class Maths {
    static int add(int a, int b) {
        return a + b;
    }
    static int subs(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
    static int mod(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        System.out.println(add(10, 2));
        System.out.println(subs(10, 2));
        System.out.println(mul(10, 2));
        System.out.println(div(10, 2));
        System.out.println(mod(10, 2));
}
}