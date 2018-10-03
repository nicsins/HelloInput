import java.util.Random;

import static input.InputUtils.intInput;

public class RandomInt {
    public static void main(String[] args) {
        //Create a random object -this is a random number generator object
        Random random=new Random();
        int x= intInput("please select the range starting with 0" +
                ",ending with what number?");
        int randomNumber = random.nextInt(x+1);
        //generate random number between 0 and 9
        System.out.println("Random seceret number between 0 and "+x+" is "+ randomNumber);

    }
}
