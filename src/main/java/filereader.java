import com.sun.javafx.iio.ios.IosDescriptor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

import static input.InputUtils.stringInput;

public class filereader {
    public static void main(String[] args)throws IOException {
        try {
            String filename = stringInput("please enter filename");
            FileReader reader = new FileReader(filename + ".txt");
            BufferedReader bufReader = new BufferedReader(reader);

            String line = bufReader.readLine();

            while (line != null) ;
            {
                System.out.println(line);

                line = bufReader.readLine();
            }
            bufReader.close();

        } catch (IOException ioe) {
            System.out.println("error");
        }
    }
}
