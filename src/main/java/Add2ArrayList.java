import java.util.ArrayList;

public class Add2ArrayList {
    public static void main(String[] args) {
        ArrayList numList = new ArrayList();
        numList.add(100);
        numList.add(200);
        numList.add(300);
        int sum =0;
        for(Object ob: numList){
            int number =(int)ob;
            sum+=number;
        }
        System.out.println("total of numbers is "+sum);
    }
}
