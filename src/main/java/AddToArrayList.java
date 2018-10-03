import java.util.ArrayList;
import java.util.regex.*;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList cities=new ArrayList();
        cities.add("Minneapolis");
        cities.add("St. Paul");
        cities.add("Brooklyn Park");
        cities.add("Bloomington");
        cities.add("Columbia Heights");

        cities.add(2,"Roseville");// Insert at this position shift up

        System.out.println(cities);
        //prints in array form
        cities.add(3,"Richfield");
        System.out.println(cities);


            ArrayList myList = new ArrayList();
            myList.add("Hello"); //add a String
            myList.add(6);    //add Integer
            myList.remove("Hello"); //remove String
            myList.add("data");
            myList.add(100);
            myList.add("More Data");

            myList.remove("More Data");

            myList.remove(1);// item 1 and 2 rfemove
            myList.remove(2);
            // remove item from list and save items value
            Object ob1=myList.remove(1);
            //remov3e item by index and save its value cast to expected type
            String ob2=(String)myList.remove(0);

          
    }
}
