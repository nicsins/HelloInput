import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class Main {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        System.out.println("hello "+name);

        int numberOfClasses = intInput("How many classes are you taking " +
                "this semester?");
        if (numberOfClasses==1) {
            System.out.println("You are taking " + numberOfClasses + " class");
        }else{
            System.out.println("You are taking " + numberOfClasses + " classes");
        }

    }
}
