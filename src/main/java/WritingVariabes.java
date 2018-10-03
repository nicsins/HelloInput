import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariabes {
    public static void main(String[] args)throws IOException{
        FileWriter writer = new FileWriter("variables.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        int intData=42;
        double dbData=987.654;
        String strData="java";

        bufWriter.write(intData+"\n");
        bufWriter.write(dbData+"\n");
        bufWriter.write(strData+"\n");
        bufWriter.write(34.544+"");
        bufWriter.write(654+"");
        bufWriter.close();



    }
}
