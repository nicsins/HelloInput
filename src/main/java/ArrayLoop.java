import java.util.Arrays;

import static input.InputUtils.positiveDoubleInput;

public class ArrayLoop {
    public static void main(String[] args) {
        String[] names={"joe","Mike","Tom","Kevein"};
        System.out.println(Arrays.toString(names));
        for (int x=0;x<names.length;x++){
            System.out.println(names[x]);

        }

String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Double[] data= new Double[12] ;
for(int x=0 ;x<months.length; x++){
   double  bill=positiveDoubleInput(" please enter bills for "+months[x]);
   data[x]=bill;
        }
        }
        }