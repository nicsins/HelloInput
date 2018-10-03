import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class guess {
    public static void main(String[] args) {
        int secretNumber = 5;
        int guesses = 5;
        int number = intInput("guess a number between 1 and 10");
        while (guesses > 0) {
            if (number > secretNumber) {
                System.out.println("lower");
                System.out.println("Try again?");
                guesses--;
                number = intInput("guess a number between 1 and 10");
            }
            if (number > secretNumber) {
                System.out.println("higher");
                System.out.println("Try again?");
                number = intInput("guess a number between 1 and 10");
            }
            guesses--;
        }


        }
    }
