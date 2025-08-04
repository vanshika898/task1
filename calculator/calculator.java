import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class  calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("  Basic Calculator  ");

        System.out.print("Enter first number: ");
        double firstNumber = Double.parseDouble(reader.readLine());

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = (char) reader.readLine().charAt(0);

        System.out.print("Enter second number: ");
        double secondNumber = Double.parseDouble(reader.readLine());

        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
