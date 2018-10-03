import java.util.ArrayList;


public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("Hello"); //add a String
        myList.add(6);    //add Integer
        myList.remove("Hello"); //remove String
        myList.add("data");
        myList.add(100);
        myList.add("More Data");

        System.out.println("Item 1 is"+myList.get(1));
        System.out.println("Item 3 is "+myList.get(3));
        //storing data in a cvariable
        //everything in a list is an object
        Object ob = myList.get(2);
        //If you know you have a string it needs to be cast to the correct type
        //Akward and error prone -fix for this in the lab
        String s = (String)myList.get(0);

        Object error =myList.get(100); // error doesn't esist

    }
}
