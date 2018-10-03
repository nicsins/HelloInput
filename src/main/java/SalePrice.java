import static input.InputUtils.intInput;
import static input.InputUtils.positiveDoubleInput;
import static input.InputUtils.stringInput;

;
public class SalePrice {
    public static void main(String[] args) {
        String productName = stringInput("what is the name of the product?");
        double price = positiveDoubleInput("what is the price of the " +
                productName + " ?");
        int quanity = intInput("how many "+productName+" to sell?");
        //calculate the total cost
        double totalPrice= price* quanity;
        System.out.println(String.format("%d  %s at each $%.2f each costs $%.2f",
               quanity,productName,price, totalPrice));
        System.out.printf("%d  %s at each $%.2f each costs $%.2f"
                ,quanity,productName,price, totalPrice);
    }
}


