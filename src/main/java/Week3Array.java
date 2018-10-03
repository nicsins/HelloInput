import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Week3Array {
    public static void main(String[] args) {
       String [] filenames = new String[7];
        filenames[0]="random.py";
        filenames[1]="assignment.doc";
        filenames[2]="report.pdf";
        filenames[3]="math.c";
        filenames[4]="airfares.xls";
        filenames[5]="main.java";
        filenames[6]="computing.java";
    String[] code=new String[3];
        code[0]=".java";
        code[1]="c";
        code[2]=".py";

        for(int x=0;x<filenames.length;x++)
           for(int y=0;y<code.length;y++)
        { String filename=filenames[x];
            String codes=code[y];
             if (filename.endsWith(codes));
            System.out.println(filenames[x]);



        }
        for (String filename : filenames) {
            System.out.println(filename);
        }

        System.out.println( Arrays.toString(filenames));//shows location

        List<String> files=Arrays.asList(filenames);


        files.forEach(System.out::println);

        String[] files2={"random.py","assignment.doc","report.pdf","math.c","airfares.xls","main.java","computing.java"};

        String [] code2={".java","c",".py"};
        for (int x=0;x< files2.length;x++){
            for(int y=0;y<code2.length;y++){
                String filename=files2[x];
                String codes=code2[y];
                if (filename.contains(codes)) {

                    System.out.println(filename);
                }
            }
        }


}}
