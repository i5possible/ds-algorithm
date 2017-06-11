package linearlist;

import java.util.ArrayList;

/**
 * Created by lianghong on 11/06/2017.
 */
public class MyArrayList {
    public static void main(String[] args) {
        long start = System.nanoTime();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(2, 4);
        integers.add(1, 2);
        long end = System.nanoTime();
        System.out.println("TimeUsed : " + (end - start));
        System.out.println(integers);
    }
}
