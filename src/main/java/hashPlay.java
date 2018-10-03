import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class hashPlay {
    public static void main(String[] args) {

        HashMap<Double,String> lakerunning=new HashMap<>();
        lakerunning.put(4.32,"Como");
        lakerunning.put(3.23,"Como");
        lakerunning.put(2.22,"Como");
        lakerunning.put(4.22,"Calhoon");
        lakerunning.put(2.42,"Calhoon");
        lakerunning.put(3.52,"Calhoon");
        lakerunning.put(5.22,"Harriet");
        lakerunning.put(1.22,"Harriet");
        lakerunning.put(3.22,"Harriet");
        String maxLake= lakerunning.get(Collections.max(lakerunning.keySet()));
        double maxTime =Collections.max((lakerunning.keySet()));
        System.out.println("The lake with the fastest time is "+maxLake+" with a time of "+maxTime);
       String lake=lakerunning.get("Como");
       Double Total=0.0;
        ArrayList<Double>times=new ArrayList<>();
       for(Entry<Double,String>entry:lakerunning.entrySet()){
           if (lakerunning.containsValue(lake)) {


           } System.out.println(times);

       }




    }
}
