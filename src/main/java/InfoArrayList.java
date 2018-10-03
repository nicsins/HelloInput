import java.util.ArrayList;

public class InfoArrayList {
    public static void main(String[] args) {
        ArrayList myList= new ArrayList();
        myList.add("Hello");
        myList.add("World");
        myList.add("Says");
        myList.add("This");
        myList.add("List");
        //how many lines
        int items=myList.size();
        System.out.println("list has"+items+"items");

        //remove first item
        myList.remove(0);
        //check size again
        items=myList.size();
        System.out.println("Now the list has"+items+"items");

        if (myList.isEmpty()){
            System.out.println("The list is empty");
        }else{
            System.out.println("the list is not empty ");
        }
        //you can squeeze in size conditions
        if(myList.size()>3){
            System.out.println(" The list has more than three items");
        }else{
            System.out.println("The list has three or fewer elements");
        }
    }
}
