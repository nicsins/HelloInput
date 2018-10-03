import java.util.HashMap;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class HashSnowfall {
    public static void main(String[] args) {
        HashMap<String,Integer>snowfall= new HashMap<>();
        snowfall.put("Jan",3);
        snowfall.put("Feb",4);
        snowfall.put("Mar",4);
        snowfall.put("Apr",5);
        snowfall.put("May",9);
        double total=0;
        for (String month:snowfall.keySet()){
            double snow=snowfall.get(month);
            total=total+snow;
        }
        System.out.println("total= "+total);
        while (true ){
            String month= stringInput("enter month");
            int snowFall= intInput("How much snow fell?");
            snowfall.put(month,snowFall);
            if(month==null || month.length()==0){
                break;}
        }
            for (String newmonth:snowfall.keySet()){
                double snow=snowfall.get(newmonth);
                total=total+snow;



        }
        snowfall.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

    }
}

