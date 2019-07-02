package InsertionSort;

import SortingAlgo.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

    @Test
    public void doInsertionSort() {
        int[] unsorted = new int[]{10, 34, 2, 56, 7, 67, 88, 42};
        int[] sorted = new int[]{2, 7, 10, 34, 42, 56, 67, 88};
        assertEquals("Answer", Arrays.toString(sorted), Arrays.toString(InsertionSort.doInsertionSort(unsorted)));
    }
}