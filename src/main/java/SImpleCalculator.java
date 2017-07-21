import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 21.07.2017.
 */
public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Math Math = new Math();
        double answer = 0;
        double firstNumber, secondNumber;
        char operator;
        boolean done = false;
        String exit = "";

        while (!done) {
            System.out.print("Please enter first number: ");
            firstNumber = scanner.nextDouble();
            System.out.println("Enter your operator + - / *");
            operator = scanner.next().charAt(0);
            System.out.print("Please enter second number:");
            secondNumber = scanner.nextDouble();

            switch (operator) {
                case '+':
                    answer = Math.add(firstNumber, secondNumber);
                    break;
                case '-':
                    answer = Math.minus(firstNumber, secondNumber);
                    break;
                case '*':
                    answer = Math.multiply(firstNumber, secondNumber);
                    break;
                case '/':
                    answer = Math.divide(firstNumber, secondNumber);
                    break;
                case '^':
                    answer = Math.power(firstNumber, secondNumber);
                    break;

            }
            System.out.println(answer);
            System.out.println("Do you want to exit y/n ?");
            exit = scanner.next();
            switch (exit) {
                case "y":
                    done = true;
                    break;
            }
        }

        scanner.close();

    }


}

