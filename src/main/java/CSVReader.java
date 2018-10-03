import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static input.InputUtils.stringInput;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = stringInput("please enter file name w/o \".csv\""+".csv");
        BufferedReader br = null;
        String line ;//initialize this way String line=""; a redundant way
        String cvsSplitBy = ",";

        try {

          //  br = new BufferedReader(new FileReader(stringInput("please enter file name w/o \".csv\""+".csv")));
            //one less step not really a big difference
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
               // String[] country = line.split("'"); this works

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
