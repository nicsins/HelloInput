import java.util.ArrayList;

public interface CapitalizingAnArray {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("javascript");
        myList.add("C#");
        myList.add("Java");
        myList.add("ruby");

        //process list items and print all items in CAPs version
      // String item = "";//CANNOT GET THIS TO WORK!!
        for (Object ob : myList) {
            Object Item = (String) ob;
             Item = ((String) Item).toUpperCase();
            System.out.println(ob);
        }
        System.out.println("The list is " + myList);

        for (int x = 0; x < myList.size(); x++) {
            String items = (String) myList.get(x);
            String uppercase = items.toUpperCase();
            myList.set(x, uppercase);//set replaces element with variable to upperecase
        }
        System.out.println("The capitalized list is " + myList);
    }
}
