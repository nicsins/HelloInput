import java.util.ArrayList;

public class MyClasses {
    public static void main(String[] args) {
        ArrayList myClasses=new ArrayList();
        myClasses.add("Java Programming");
        myClasses.add("Program management");
        myClasses.add("SQL Server");

        System.out.println(myClasses);

        myClasses.remove("Java Programming");

        myClasses.add("Windows");
        myClasses.add("Data Com");
        myClasses.add("Basket weaving");

        for(int x=0;x<1 ;x++){
            System.out.println(myClasses);
        }
        for (Object ob: myClasses){
            System.out.println(ob);

        }
        System.out.println(myClasses.stream());

    }
}
