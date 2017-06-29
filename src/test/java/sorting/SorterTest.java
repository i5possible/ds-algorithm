package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;
import java.util.stream.Collectors;
import entity.Car;
import entity.Person;

/**
 * Created by lianghong on 11/06/2017.
 */
@RunWith(Parameterized.class)
public class SorterTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<Sorter> integerSorterList = getIntegerSorterList();
        List<Sorter> personSorterList = getPersonSorterList();

        Integer[] input = {2, 1, 4, 5, 3};
        Integer[] expected = {1, 2, 3, 4, 5};

        Person lh = new Person("Liang Hong", 25, new Car(0));
        Person sxb = new Person("Shang Xiaobin", 24, new Car(100));
        Person cl = new Person("Chen Liang", 47, new Car(200));
        Person[] personInput = {lh, sxb, cl};
        Person[] personExpected = {cl, lh, sxb};

        List<Object[]> result = getResultList(integerSorterList, personSorterList,
                input, expected, personInput, personExpected);
        return result;
    }

    private static List<Object[]> getResultList(
            List<Sorter> integerSorterList, List<Sorter> personSorterList, Integer[] input,
            Integer[] expected, Person[] personInput, Person[] personExpected) {
        List<Object[]> result = new ArrayList<>();
        result.addAll(integerSorterList.stream()
                .map(integerSorter -> new Object[]{integerSorter, input, expected})
                .collect(Collectors.toList()));
        result.addAll(personSorterList.stream()
                .map(personSorter -> new Object[]{personSorter, personInput, personExpected})
                .collect(Collectors.toList()));
        return result;
    }

    private static List<Sorter> getPersonSorterList() {
        List<Sorter> personSorterList = new ArrayList<>();
        personSorterList.add(new BubbleSorter<Person>());
        personSorterList.add(new QuickSorter<Person>());
        personSorterList.add(new SelectionSorter<Person>());
        personSorterList.add(new InsertionSorter<Person>());
        return personSorterList;
    }

    private static List<Sorter> getIntegerSorterList() {
        List<Sorter> integerSorterList = new ArrayList<>();
        integerSorterList.add(new BubbleSorter<Integer>());
        integerSorterList.add(new QuickSorter<Integer>());
        integerSorterList.add(new SelectionSorter<Integer>());
        integerSorterList.add(new InsertionSorter<Integer>());
        return integerSorterList;
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
