/* this is pom.xml dependency tyyou need to add
*   <dependency>
		<groupId>com.opencsv</groupId>
		<artifactId>opencsv</artifactId>
		<version>3.8</version>
	</dependency>

	*/






import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

import static input.InputUtils.stringInput;

public class CSVReaderExample {

    public static void main(String[] args) {

        String csvFile = stringInput("please enter file name w/o \".csv\""+".csv");

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
          //reader = new CSVReader(new FileReader( stringInput("please enter file name w/o \".csv\""+".csv"))); either way
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

