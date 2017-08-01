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
        String exit;
        while (!done) {
            System.out.println("Привет чувак, это супер простой калькулятор на дажве! Попробуй ;) ");
            System.out.println("Давай ка, введи первое число: ");
            firstNumber = scanner.nextDouble();
            System.out.println("Что делать будем братан? Вычетать - / ? Складывать - + ? Дедить - /? Умножать - *? Или %.");
            System.out.println("Выберай вводи: ");
            operator = scanner.next().charAt(0);
            System.out.print("И давайка второе введём:");
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
                        if (secondNumber == 0) {
                            System.out.println("Ну зачем так? Не надо! На ноль делить нельзя.");
                            System.out.println("Введи второе число ещё раз братишь, будб любезен. ))");
                            secondNumber = scanner.nextDouble();
                        }
                        answer = Math.divide(firstNumber, secondNumber);
                        break;
                    case '^':
                        answer = Math.power(firstNumber, secondNumber);
                        break;

                    default:
                        System.out.println("Братан ты ошибся.  Этот калькулятор слишком прост в нём нет таких операций. Попробуй ещй раз!");
                        break;
                }
                System.out.println(answer);
                System.out.println("Всё братишь? уходищь? Да/Нет ?");
                exit = scanner.next();
                switch (exit) {
                    case "Да":
                        System.out.println(" Ты заходи если чо ;)");
                        done = true;
                        break;
                }
            }

            scanner.close();

        }


}

