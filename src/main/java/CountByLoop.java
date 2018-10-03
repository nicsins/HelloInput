import static input.InputUtils.intInput;

public class CountByLoop {

    public static void main(String[] args) {
        int num ;
        int total=0;
        num = intInput("how high would you like me to count?");
        for (int x = 1 ; x < num+1 ; x = x +1) {
            System.out.println(x);
            total=total+x;
            System.out.println(total);
        }

    }
}

