import java.util.regex.Pattern;

public class FindIt {
    public static void main(String[] args) {
      String  Description ="get the monkey off the bed";
        if (Description.contains("monkey")) {

            System.out.println(Description);

            if(Pattern.matches("the",Description));
            System.out.println("poo");
        }
    }
}
