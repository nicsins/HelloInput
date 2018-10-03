import com.sun.org.apache.xpath.internal.operations.Bool;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static sun.swing.MenuItemLayoutHelper.max;

public class Lambdas {
    public static void main(String [] args){
        ArrayList<Integer>Ints=new ArrayList<Integer>();
        Ints.add(2);
        Ints.add(5);
        Ints.add(6);
        Ints.add(8);
        Ints.add(9);
        Ints.replaceAll(n->n*n/2);//lambda function
        System.out.println("1 instance"+Ints);
        System.out.println("2 instance"+Ints.stream().map(n->n*n).collect(Collectors.toList()));
        Ints.replaceAll(n->n*=n*n);
        System.out.println("3 instance"+Ints);
        ArrayList<Integer>newInt=new ArrayList<>();
        newInt.add(2);
        newInt.add(4);
        newInt.add(5);
        newInt.add(7);
        newInt.add(8);

        System.out.println("4 instance"+newInt.stream()
                .map(n -> n * n)
                .collect(Collectors.toList()));//one liner in print statement

        System.out.println("5 Instance "+newInt.stream().map(n->n+n).collect(Collectors.toList()));        //tp find

       int sum = newInt.stream().reduce(0, (x,y) -> x+y);

    System.out.println("7 instance "+sum);
        int sum2 = newInt.parallelStream().reduce(0, Integer::sum);
        System.out.println("8 instance "+ newInt.parallelStream().reduce(0, Integer::sum));
        newInt.stream().mapToInt(Integer::intValue).sum();
        System.out.println("9 instance "+newInt.stream().mapToInt(Integer::intValue).sum());
        System.out.println(newInt.stream().reduce(0,(integer, integer2) -> sum));//how to sum an array of ints
        System.out.println(newInt);
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer>Inumbers= Arrays.asList(6,3,5,6,7,9,8);// create a list
        int total=0;
        for (int n:numbers) {total+=n;
        }
        System.out.println("sum list "+Inumbers.stream().reduce(0,Integer::sum));//esiest way to sum a list so far
        System.out.println("Average list "+Inumbers.stream().reduce(0,Integer::sum)/Inumbers.size());//average
        System.out.println("max list "+Collections.max(Inumbers));
        System.out.println("min list "+Collections.min(Inumbers));
//        System.out.println("product "+Inumbers.stream().reduce(0, Integer::product));

//check all elements of an array fpr same value
        List<Boolean>allTrue=new ArrayList<>();
        allTrue.add(true);
        allTrue.add(true);
        allTrue.add(true);
        allTrue.add(true);
        allTrue.add(true);
        allTrue.add(true);
        boolean isAllTrue = allTrue.stream().allMatch(val -> val == true);
        System.out.println(isAllTrue);
        allTrue.add(false);
        System.out.println(allTrue.stream().allMatch(val -> val == true));//one liner no var needed
        boolean isAllTrue2 = allTrue.stream().allMatch(val -> val == true);// you have to run again to check
        System.out.println(isAllTrue2);
//        List<Boolean>IsAllTruee




    }
}
