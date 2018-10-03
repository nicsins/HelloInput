import static input.InputUtils.stringInput;

public class HELLO {
    public static void main(String[] args) {
        String name= stringInput("please enter name!");
        String Hi=sayHi(name);
        System.out.println(Hi);
    }

    private static String sayHi(String name) {
      return "hello "+name;
    }


}
