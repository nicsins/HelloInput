import java.util.HashMap;

public class HelloHashMap {
    public static void main(String[] args) {

        HashMap <Integer ,String> className =new HashMap ();
        className.put(2545,"Java");
       className.put(1150,"Programming");
       className.put(1425,"datacom");
        System.out.println(className);

        String class2545=className.get(2545);
        System.out.println(class2545);

        className.put(2545,"Java Programming");
        className.put(1234,"Java Programming");
        System.out.println(className);

        System.out.println(className.containsKey(2545));
        System.out.println(className.containsKey(2945));
        System.out.println(className.containsValue("Java Programming"));
        System.out.println(className.containsValue("Java Programming"));
        className.put(999,"Java Programming");
        System.out.println(className);

        for (Integer key: className.keySet()){
            System.out.println(key);
            System.out.println(className.get(key));

        }}
}
