import static input.InputUtils.intInput;
// ask useer for five numbers between 0 and 100 then display
// the sum and the average of thee numbers
public class Add5Numbers {
    public static void main(String[] args) {
        int numbersEntered=0;
        int sumOfNumbers =0;
        while (numbersEntered<5){
            int number =intInput("Please " +
                    "enter a number between 0 and 100");

            if (number <0 || number>100)
            {
                System.out.println("you must " +
                        "enter a number between 0 and 100");
                continue;

            }
            numbersEntered++;
            System.out.println("you " +
                    "have now entered "+numbersEntered+
            "number(s). The last number entered was "+number);

            sumOfNumbers = sumOfNumbers+ number;

        }
        System.out.println("Thanks for the" +
                " program the total " +
                "of all numbers was "+sumOfNumbers);
        //You'll probably process the numbers -
        // lets add them up  and figure out the average
        System.out.println("and the average of all " +
                "numbers was "+sumOfNumbers/5);

    }
}
