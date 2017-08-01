import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by oGGi on 01.08.2017.
 */
public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double average = 0;
        double input = 0;
        double size = 0;
        String choose = " ";
        System.out.println("Enter number, when you insert all you need enter '='.");
        while (!choose.contentEquals("=")) {

            System.out.println("Next number: ");
            choose = scanner.next();

            if (choose.contentEquals("=")) {
                average = size / count;
                System.out.println("Средне арифметическое: " + average);
            }
                else {
                    input = Double.parseDouble(choose);
                    size += input;
                    count++;
                }
        }
    }
}
