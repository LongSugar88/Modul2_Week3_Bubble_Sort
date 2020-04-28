import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bubble_SortTest {
    Bubble_Sort<Integer> myList = new Bubble_Sort<>();

    @BeforeEach
    void setup(){
        myList = new Bubble_Sort<>();
    }
    @Test
    void sort() {
        Integer[] myArray = {5,7,4,5,2,9,0,1,3};
        Integer[] expect = {9,7,5,5,4,3,2,1,0};
        Integer[] result = myList.sort(myArray);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    void sort1() {
        Integer[] myArray = {7,9,6,4,0,8,2,3,5,1};
        Integer[] expect = {9,8,7,6,5,4,3,2,1,0};
        Integer[] result = myList.sort(myArray);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    void sort2() {
        Integer[] myArray1 = {2,0,4,6,8,7,3,1,5};
        Integer[] expect = {8,7,6,5,4,3,2,1,0};
        Integer[] result = myList.sort(myArray1);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    void sort3() {
        Integer[] myArray = {9,5,7,5,4,3,2,1,0};
        Integer[] expect = {9,7,5,5,4,3,2,1,0};
        Integer[] result = myList.sort(myArray);
        Assert.assertArrayEquals(expect, result);
    }
}