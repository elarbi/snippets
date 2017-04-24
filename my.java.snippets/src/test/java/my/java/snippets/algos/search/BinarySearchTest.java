package my.java.snippets.algos.search;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by elarbiaboussoror on 17/04/2017.
 */
public class BinarySearchTest {
    List<Long> list;
    private int listSize;

    @Before
    public void setUp() {
        listSize = Integer.MAX_VALUE / 30_000;
        list = new ArrayList<Long>(listSize);

        for (long j = 0; j < listSize; j++) {
            list.add(j);
        }
        //list = Arrays.asList(1L, 2L, 5L, 8L, 10L, 34L, 50L);
        //list = Arrays.asList(1L, 2L, 5L, 8L);
    }


    @Test
    public void binary_search_of_existing_element_should_return_correct_index() {
        System.err.println("list size: " + listSize);
        //Assuming a Long takes 16 bytes (actually 8 + 8 for Object overhead)
        System.err.println("list memory footprint: " + new Long(listSize) * 16L / 1024L / 1024L / 1024L + "Gbytes");


        long startTime = System.currentTimeMillis();

//        binarySearchAllElementsInTheList(list);
        assertThatListElementAreFound(list);

        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
//
        System.err.println("Ellapsed in s: " + elapsed / 1000);

    }

    private void binarySearchAllElementsInTheList(List<Long> list) {
        Long[] a = list.toArray(new Long[]{});
        for (Long element : list) {

            int indexOfElement = Arrays.binarySearch(a, element);

//            BinarySearch.binarySearch(element, list, 0);

//            BinarySearch.binarySearch(element, list);


        }
    }

    private void assertThatListElementAreFound(List<Long> list) {

        Long[] a = list.toArray(new Long[]{});

        for (Long element : list) {

            //Integer elementIndex = list.indexOf(element);
             int indexOfElement = Arrays.binarySearch(a, element);

//            int indexOfElement = BinarySearch.binarySearch(element, list);

            //assertThat(indexOfElement).isEqualTo(elementIndex);

        }
    }


}
