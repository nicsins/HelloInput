import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnArrayList {
    public static void main(String[] args) {
        ArrayList myList= new ArrayList();
        myList.add("Hello");
        myList.add("World");
        if(myList.remove("Hello")) {
            System.out.println(("Removed\"Hello\" from list"));
        }else{
            System.out.println("\"Hello\" was not in the list");
        }
        if(myList.remove("Goodbye")){
            System.out.println("Removed\"Goodbye\" from list");
        }else{
            System.out.println("\"Goodbye\" was not on list");




            }
    }
}
