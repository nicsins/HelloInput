public class FindsString {
    public void printNames(String string) {
    int i = 0;
    while (true) {
        int found = string.indexOf("name:", i);
        if (found == -1) break;
        int start = found + 5; // start of actual name
        int end = string.indexOf(":", start);
        System.out.println(string.substring(start, end));
        i = end + 1;  // advance i to start the next iteration

    }
}
}
