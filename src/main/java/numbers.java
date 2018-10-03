import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
public class numbers {
    public static void main(String[] args)  {

        try { BufferedWriter bufWriter = new BufferedWriter(new FileWriter("numbers.txt"));

            FileWriter writer = new FileWriter("numbers.txt");
            bufWriter = new BufferedWriter(new FileWriter("numbers.txt"));

            int dat1 = 67;
            int dat2 = 68;
            int dat3 = 69;
            bufWriter.write("these are numbers\n");
            bufWriter.write(dat1 + "\n");
            bufWriter.write(dat2);
            bufWriter.write(dat3);
            bufWriter.close();


        } catch (IOException ioe) {

        System.out.println("IOE Error ");}
        }
}
//TRY and CATCH block