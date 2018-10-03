import java.util.ArrayList;

public class NewArrayList{
    public static void main(String[] args) {
        ArrayList myList= new ArrayList();
        myList.add("Hello");
        myList.add("World");
        myList.add("Says");
        myList.add("This");
        myList.add("List");
        //Print the whole list
        System.out.println(myList);
        //Print list item by item
        for (Object ob: myList){
            System.out.print(ob+" ");
        }
        System.out.println();
        //traditional loop
        for (int i=0;i<myList.size(); i++){
            System.out.println(myList.get(i));

        }
        //foreach
        myList.forEach(System.out::println);
        myList.forEach(word->  System.out.print(word + "; "));//lambda
    }
}
