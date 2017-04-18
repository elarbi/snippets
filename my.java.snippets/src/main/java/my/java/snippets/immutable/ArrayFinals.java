package my.java.snippets.immutable;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by elarbiaboussoror on 28/03/2017.
 */
public class ArrayFinals {
    public static void main(String[] args) {
        final String[] stringArray = {"A", "B"};
        stringArray[1] = "ZZ";

        Arrays.asList(stringArray).stream().forEach(s ->System.err.println(s));
        final String immutableS = "T";


    }
}
