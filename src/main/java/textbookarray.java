import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static input.InputUtils.stringInput;

public class textbookarray {
    public static void main(String[] args) {
        String[] textbooks = new String[5];
        //create an array that stores 5 strings
        //loop repeats 5  times notice loop counter variable number
        //so we can use the variable number to refer to each array element in turn
        // can use the loop to read from ,or write to every array element in turn

        for (int number =0; number < textbooks.length;number++){
            // Get data about one book from the user
            String bookName = stringInput("Please enter name of textbook");
            //using the loop counter to write each array element in turn
            textbooks[number]=bookName;

        }

        System.out.println("thank you for the data enetered ;");

        System.out.println(Arrays.toString(textbooks));

        List<String> books=Arrays.asList(textbooks);

         books.forEach(book->  System.out.print(book+ "; "));//list accross

         books.forEach(System.out::println);//in a list verticalri

        String[] books2={"Catcher in rye","fear and loathing","happy death","the metamorphisis"};

        List<String>booksTwo=Arrays.asList(books2);

        booksTwo.forEach(book2-> System.out.print(book2+" "));

        booksTwo.forEach(System.out::println);

}
    }
