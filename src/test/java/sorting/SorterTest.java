package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sorting.domain.Car;
import sorting.domain.Person;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by lianghong on 11/06/2017.
 */
@RunWith(Parameterized.class)
public class SorterTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Integer[] input = {2, 1, 4, 5, 3};
        Integer[] expected = {1, 2, 3, 4, 5};

        Person lh = new Person("Liang Hong", 25, new Car(0));
        Person sxb = new Person("Shang Xiaobin", 24, new Car(100));
        Person cl = new Person("Chen Liang", 47, new Car(200));
        Person[] personInput = {lh, sxb, cl};
        Person[] personExpected = {cl, lh, sxb};

        return Arrays.asList(new Object[][]{
                {new BubbleSorter<Integer>(), input, expected},
                {new BubbleSorter<Person>(), personInput, personExpected},
                {new QuickSorter<Integer>(), input, expected},
                {new QuickSorter<Person>(), personInput, personExpected}
        });
    }

    private Sorter sorter;

    private Comparable[] input;
    private Comparable[] expected;

    public SorterTest(Sorter sorter, Comparable[] input, Comparable[] expected) {
        this.sorter = sorter;
        this.input = input;
        this.expected = expected;
    }
  
    @Test
    public void test() {
        Assert.assertArrayEquals(expected, sorter.sort(input));
    }
}
