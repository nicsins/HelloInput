import static input.InputUtils.positiveDoubleInput;
import static input.InputUtils.stringInput;

public class Miles2Km {
    public static void main(String[] args) {

        String college= stringInput("Which college do you attend?");
         if (college.equals( "MCTC")){
             System.out.println("Good choice!");
         }
         else{
             System.out.println("sucks to be you!");}
        double miles = positiveDoubleInput("how far " +
                "is your home from MCTC in miles?");
        double kiloMeters = miles * 1.6;

        if (kiloMeters <= 10) {
            System.out.println("you live less than 10 kilometers from MCTC");
        } else if (kiloMeters>=101){
            System.out.println("you live really far away!");
        }

        else {
            System.out.printf("it is %,.2f Kilometers from your home to MCTC!", kiloMeters);
        }
    }
}
