package clasPract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteArrayList {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("arrayList.txt"));
            ArrayList<String> months=new ArrayList<>();
            months.add("Jan,");
            months.add("Feb,");
            months.add("Mar,");
            months.add("Apr,");
            months.add("May,");
            months.add("Jun,");
            months.add("Jul,");
            months.add("Aug,");
            months.add("Sep,");
            months.add("Oct,");
            months.add("Nov,");
            months.add("Dec,");
            for(String m:months){
                writer.write(m);
            }
            writer.close();

        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
