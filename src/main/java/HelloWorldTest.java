import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class HelloWorldTest {
    public static void main(String[] args) {

        // asks the user to enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number...");
        String userInput = scanner.nextLine();


        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is not a number");
        } else {
            System.out.println(userInput);
        }


        // Flips the case of the string
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));

        // Reverses the string
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
