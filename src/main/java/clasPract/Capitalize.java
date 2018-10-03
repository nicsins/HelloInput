package clasPract;

import org.apache.commons.lang3.text.WordUtils;


import java.util.Arrays;

public class Capitalize {

    public static  void main(String[] args) {
        String[] AOStr={"bob","matt","kevin","joe"};//initialize array

        System.out.println(Arrays.toString(AOStr));//print array

        upper ( AOStr);//call method

        System.out.println(Arrays.toString(AOStr));//print again to see uppercqase

    }
    public static void upper (String[] AOStr){
        for (int x=0 ;x<AOStr.length;x++){
            AOStr[x]= WordUtils.capitalize(AOStr[x]);// how to upper only first word
        }


    }


}


