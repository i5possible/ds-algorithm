package sorting;

import org.junit.Assert;
import org.junit.Test;

import javax.smartcardio.Card;

/**
 * Created by lianghong on 11/06/2017.
 */
public class SorterTest {
    private Integer[] input = {2, 1, 4, 5, 3};
    private Integer[] expected = {1, 2, 3, 4, 5};

    private Person lh = new Person("Liang Hong", 25, new Car(0));
    private Person sxb = new Person("Shang Xiaobin", 24, new Car(100));
    private Person cl = new Person("Chen Liang", 47, new Car(200));
    private Person[] personInput = {lh, sxb, cl};
    private Person[] personExpected = {cl, lh, sxb};

    @Test
    public void bubble_sort_test() {
        Sorter<Integer> sorter = new BubbleSorter<>();
        Integer[] actual = sorter.sort(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubble_sort_object_test() {
        Sorter<Person> sorter = new BubbleSorter<>();
        Person[] actual = sorter.sort(personInput);
        Assert.assertArrayEquals(personExpected, actual);
    }
}
