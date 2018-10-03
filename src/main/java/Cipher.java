import java.util.ArrayList;
import java.util.Collections;


public class Cipher {
    public ArrayList<Double> a=new ArrayList<>();


    public double addArray(ArrayList a) {
        double sum = 0;
        for (Object o : a) {
            Double A = (Double) o;
            sum += A;

        }
        return sum;
    }
    public double averageArray(ArrayList a){
        double avg=0;
        for (Object o :a) {
            Double A=(Double)o;
            avg+=A;

        }return avg/a.size();
    }

    public double getMax(ArrayList a){
       double max=0;
        for (Object o :a) {
            Double A=(Double)o;
            if(A>max){
                max=A;
                }
        }return max;



        }}








