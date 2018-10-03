package clasPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPract {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList();
        list.add("Hi");
        list.add("Lo");
        list.add("Hi");
        list.add("No");
        list.add("Hi");


        for (String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        list.remove("Hi");
        for (String s:list){
            System.out.print(s+" ");
        }
        System.out.println(list.stream().collect(Collectors.toList()));
        list.forEach(System.out::println);

    }
}
