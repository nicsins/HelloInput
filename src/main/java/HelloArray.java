import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;

import static input.InputUtils.stringInput;

public class HelloArray {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList();
        cars.add("yugo");
        cars.add("ford");
        cars.add("chevy");
        cars.add("alfa");
        cars.add("suzuki");

        int num=0;
        for(String car:cars){
            num++;
            System.out.println(car+",make number "+num);}
        int[] numb={7,5,4,3,2,11};
        for(Integer i :numb){
            System.out.println(numb);
        }

        String firstCar= cars.remove(0);
            System.out.println("first car "+firstCar);

      for (int i =0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }

        String secondCar=cars.get(1);
        System.out.println(secondCar);

        System.out.println(cars.size());
        boolean carsyugo=cars.contains("yugo");
         for(Object ob :cars){
             String car=(String)ob;
             System.out.println(car);
         }

        for (int x=0;x<cars.size();x++){
            String car=(String )cars.get(x);
            String upper=car.toUpperCase();
            cars.set(x,upper);

    }
        System.out.println("CAP list"+cars);

         for (int x=0; x<cars.size();x++){
             cars.set(0,cars.get(x).toUpperCase());
         }
        System.out.println(cars);
         int longest=0;
         String longestCar=cars.get(0);
         for (String car:cars){
             if (car.length()>longest){
                 longest=car.length();
                 longestCar=car;
             }
         };
        System.out.println("longest name is "+longest+" letters");
        System.out.println(longestCar);
        ArrayList<String>userdata=new ArrayList<>();
        while(true){
            String data=stringInput("please typre in a name of a car");
            if (data.length()==0){
                break;

            }else{
                for(String item:userdata ){
                    if (item.equals(data)){
                        System.out.println("item allready is in list");
                    }
                }
            }
            userdata.add(data);
        }num=1;
        for (String input: userdata){
            System.out.println(input);
            num++;

        }
        System.out.println("the total number of cars is "+num);

}
    }