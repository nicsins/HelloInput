import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static input.InputUtils.positiveDoubleInput;
import static input.InputUtils.stringInput;
import static input.InputUtils.yesNoInput;

public class HashPlay2 {
    public static void main(String[] args) {
       HashMap lakeRunning =  BuildMap();

    }
        public static HashMap BuildMap() {
            HashMap<String, ArrayList> lakeRunning = new HashMap<>();
            lakeRunning.put("Name", new ArrayList<Double>());
            lakeRunning.get("Name").add(3.4);
            lakeRunning.get("Name").add(4.2);
            lakeRunning.get("Name").add(5.4);
            lakeRunning.get("Name").add(1.6);
            lakeRunning.get("Name").add(3.2);
            lakeRunning.put("Homo", new ArrayList<Double>());
            lakeRunning.get("Homo").add(1.4);
            lakeRunning.get("Homo").add(3.2);
            lakeRunning.get("Homo").add(4.2);
            lakeRunning.get("Homo").add(1.2);
            lakeRunning.get("Homo").add(5.4);
            lakeRunning.get("Homo").add(2.2);
            System.out.println(lakeRunning);
            for (String lake : lakeRunning.keySet()) {
                System.out.println(Collections.min(lakeRunning.get(lake)));


            }return lakeRunning;
        }

        public void running() {

            while (moreLakes()) {
                String lake = stringInput("Enter lake name");
                double time = positiveDoubleInput("Enter time for running lake " + lake);
                addLake(lake, time);
            }
        }

        public double fastest_time(String lake,HashMap lakeRunning){
            for (Object l: lakeRunning.keySet()) {
                String L=(String)l;
                if(L.equalsIgnoreCase(lake));




            }return 0;
        }
        public void addLake (String lake,double time){

    }

    private boolean moreLakes() {
        return yesNoInput("More lake data to add?");
    }
}
