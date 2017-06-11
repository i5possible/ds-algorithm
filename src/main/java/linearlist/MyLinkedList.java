package linearlist;

import java.util.LinkedList;

/**
 * Created by lianghong on 11/06/2017.
 */
public class MyLinkedList {
    public static void main(String[] args) {
        long start = System.nanoTime();
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(3);
        integers.addFirst(1);
        integers.addLast(5);
        integers.add(1, 2);
        integers.add(3,4);
        long end = System.nanoTime();
        System.out.println("TimeUsed : " + (end - start));
        System.out.println(integers);
    }
}
