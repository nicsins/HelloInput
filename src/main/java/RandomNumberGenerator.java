import java.util.Random;

import static input.InputUtils.stringInput;

public class RandomNumberGenerator {
    public static void main(String[] args) {
      Random randomNumberGenerator  = new Random();

        while ((true)) {

            System.out.println("Would you like a random number?");
            System.out.println("Enter any key for a random number except Q to quit");

            String userInput =stringInput();
            if (userInput.equalsIgnoreCase("q")){
                    break;// kills the loop
        }
            //If we get here the loop didnt break
            // generate random number place the range in the args
            int randomNumber= randomNumberGenerator.nextInt(44);
            //.nextInt() with no arg generates random int
            System.out.println("Your random number is "+ randomNumber);

        }
        System.out.println("Thank you for playing ! GOOD BYE!!!!");

    }
}
