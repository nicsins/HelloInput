import static input.InputUtils.intInput;
        import static input.InputUtils.stringInput;

//this program makes a square of any charactor you input
// of any size
public class SquareCharWithInput {
    public static void main(String[] args) {
        int numChar;

        String typechar = stringInput("Choose a character for your square:");
        numChar = intInput("how many " + typechar + " rows and columns?");
        for (int x = 0; x < numChar; ++x) {
            for (int y = 0; y < numChar; ++y) {
                System.out.print(typechar);
            }

            System.out.println();


        }
    }
}
