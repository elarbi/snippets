package my.java.snippets.concurrency;

import java.util.Arrays;

/**
 * Created by elarbiaboussoror on 03/04/2017.
 */
public class ConcurrencyUtils {
    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
        System.err.println("number of cores: "+i);


    }
}
