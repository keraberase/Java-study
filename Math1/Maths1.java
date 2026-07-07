package Math1;
import java.util.Scanner;

public class Maths1 {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name > ");
        String userName = input.nextLine();
        System.out.println("Welcome " + userName);

        System.out.print("Please enter the first number > ");
        int number1 = input.nextInt();

        // Read the second number from the user
        System.out.print("Please enter the second number > ");
        int number2 = input.nextInt();

        // format these output results
        System.out.println(String.format("%d + %d = %d", number1, number2, number1 + number2));
        System.out.println(String.format("%d - %d = %d", number1, number2, number1 - number2));
        System.out.println(String.format("%d * %d = %d", number1, number2, number1 * number2));
        System.out.println(String.format("%d / %d = %.2f", number1, number2, (double) number1 / number2));
    }
}