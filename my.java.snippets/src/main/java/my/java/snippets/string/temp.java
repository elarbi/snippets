package my.java.snippets.string;

/**
 * Created by elarbiaboussoror on 08/03/2017.
 */
public class temp {
    public static void main(String[] args) {
        String s = "abcd";
        byte[] bytes = s.getBytes();
        System.err.println(bytes);
        String s1 = new String(bytes);
        System.err.println(s1);
    }
}
