import java.util.Stack;

public class PostfixExpressionEvaluator {

    public static int evaluate(String expression) {

        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {

                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;

                    case '-':
                        stack.push(a - b);
                        break;

                    case '*':
                        stack.push(a * b);
                        break;

                    case '/':
                        stack.push(a / b);
                        break;

                    default:
                        System.out.println("Invalid Operator");
                        return -1;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String expression = "23*54*+9-";

        int result = evaluate(expression);

        System.out.println("Postfix Expression: " + expression);
        System.out.println("Result: " + result);
    }
}