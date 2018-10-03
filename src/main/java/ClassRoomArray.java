public class ClassRoomArray {
    public static void main(String[] args) {
        //Create a string array with data
        String [] classrooms ={"T3010","T3020","T3030",
        "T3040","T3050","T3080"};
        int numOfClassrooms = classrooms.length;

        System.out.println("there are "+numOfClassrooms+
                " classrooms");

        for(int x=0;x<classrooms.length;x++){
            System.out.println(classrooms[x]);

        }
    }
}
