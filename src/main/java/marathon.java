public class marathon {
    public static void main(String[] args) {

                double distance=1;
                double marathon=26.2;
                int numWeeks=1;
                while(distance<=marathon){
                    distance*=1.1;
                    numWeeks++;
                    System.out.printf("week " + numWeeks+ " you ran %.2f miles\n ", distance);
                   // System.out.println();
                }
        System.out.println("it took "+numWeeks+" to get ready for the marathon");
    }
}
