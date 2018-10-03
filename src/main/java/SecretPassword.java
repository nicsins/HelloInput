import static input.InputUtils.stringInput;

public class SecretPassword {
    public static void main(String[] args) {


        String secretPasword = "kittens";
        System.out.println();
        ;
        String userPassword = stringInput("Enter the password");
        //always .equals method to check if two strings
        // are the same (have exact characters)
        int counter=0;
        while (!userPassword.equals(secretPasword)) {
            //user gets it wrong
            System.out.println("incorrect access denied!!");
            counter++;
            if (counter>5){
                System.out.println("DENIED!");
                break;
            }
            //ask s to try again
            System.out.println("Try again?");
            //Replace user Password with the users next attempt
            userPassword = stringInput("Enter password");
            //If the user gets it wrong loop will repeat}
        }

        // if the loop condition is false , then the user got the password correct
        //print access granted
        System.out.println("Access Granted");
    }
}
