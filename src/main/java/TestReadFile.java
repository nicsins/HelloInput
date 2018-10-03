
import static input.InputUtils.stringInput;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFile {

    public static void main(String args[]) {

        String fileName =stringInput("please enter file name"+".txt");

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
       // try (Stream<String> stream = Files.lines(Paths.get(stringInput("please enter file name"+".txt")))) {  alt way

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
