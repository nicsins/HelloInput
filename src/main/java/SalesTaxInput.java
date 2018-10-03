import java.text.NumberFormat;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class SalesTaxInput {
    public static void main(String[] args) {
        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        // loop repeats as long as the user wants to do more calculations
        while (moreCalculations) {
           price = doubleInput("Type in price");
           double priceIncTax =price * salesTax;
           //use this way to format or
            NumberFormat currencyFormmatter=NumberFormat.getCurrencyInstance();
            String formattedPrice= currencyFormmatter.format(priceIncTax);
            System.out.println("the price plus tax is"+ formattedPrice);
            //simpler
            System.out.printf("the price plus tax is : $ %.2f",priceIncTax);
            System.out.println();
            //ask user if they want to continiue
            moreCalculations=yesNoInput("Do you want to continue?");
        }
        System.out.println("Thanks for using our program goodbye!");
    }
}
