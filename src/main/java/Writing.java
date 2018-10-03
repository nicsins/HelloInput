import  java.io.BufferedWriter;
import  java.io.FileWriter;
import  java.io.IOException;

public class Writing {
    public static void main(String[] args)throws IOException {
        //shows how to create a file
        FileWriter writer=new FileWriter("hello.txt");
        BufferedWriter bufWriter=new BufferedWriter(writer);

        bufWriter.write("hello\n");
        bufWriter.write("Data here\n");
        bufWriter.write("Goodbye\n");
        bufWriter.close();
        // overwrites file above
        writer=new FileWriter("hello.txt");

        bufWriter=new BufferedWriter(writer);

        bufWriter.write("this data\n");

        bufWriter.write("This overides the first set of data.\n");

        bufWriter.close();
        //append file
        writer = new FileWriter("hello.txt",true);//appends file


        bufWriter.write("this data\n");

        bufWriter.write("Thisappends the first set of data.\n");
        bufWriter.close();




    }
}
