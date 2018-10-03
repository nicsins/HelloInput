import static input.InputUtils.intInput;
import static input.InputUtils.positiveDoubleInput;

public class milesPeral {

    //main method
    public static void main(String[] args) {
        double miles = positiveDoubleInput("how many  miles driven?");
        double gallons = positiveDoubleInput("How many gallons used ?");
        double cost=positiveDoubleInput("How much did you pay per gallon?");
        double milesPer = MilesPerGal(miles, gallons);
        double total=totalCost(gallons,cost);
        System.out.println("On your trip you got "+milesPer+" miles per gallon");
        System.out.printf("you paid $%.2f to go on your trip",total);

}

    public static double MilesPerGal (double miles,double  gallons){


        return miles/gallons;}

    public static double totalCost(double gallons,double cost) {
        double total = gallons*cost;
        return total;

    }

    }





