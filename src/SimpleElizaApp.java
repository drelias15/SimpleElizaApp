
import java.util.Scanner;

public class SimpleElizaApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String question;

        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        question = keyboard.nextLine();


        while (!question.equalsIgnoreCase("q") && !question.equalsIgnoreCase("i am feeling great") ) {

            System.out.println(question);
            question = keyboard.nextLine();
        }
        System.out.println("Thank you.");
    }
}
