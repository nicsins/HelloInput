

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WriteARRAY {
    public static void main(String[] args) throws IOException{
        ArrayList<String >todo=new ArrayList<>();
        todo.add("Grading");
        todo.add("Pay water bill");
        todo.add("EAT TACOS");
        todo.add("pet Cat");
        todo.add("call teacher");
        todo.forEach(System.out::println);//PRINT WITH FOREACH

        //another way to convert array to list
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // IntStream.of or Arrays.stream, same output
        //List<Integer> list = IntStream.of(number).boxed().collect(Collectors.toList());

        List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
        //boxing issue is why used box creates a boxed list {1,2,3,4,5,6}
        System.out.println("list : " + list);



    }




    }

