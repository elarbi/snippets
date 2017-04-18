package my.java.snippets.algos.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by elarbiaboussoror on 17/04/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
        long i = 4294967296L;

    }
    public static int binarySearch(Long element, List<Long> list, int offset) {
        if(list.isEmpty()) return -1;
        int middle = (int) Math.floor(list.size() / 2);

        if(element.equals(list.get(middle)))
            return middle+offset;
        if(element > list.get(middle))
            return binarySearch(element, list.subList(middle+1, list.size()), offset+middle+1);
        if(element < list.get(middle))
           return binarySearch(element, list.subList(0, middle), offset);

        return -1;
    }
}
