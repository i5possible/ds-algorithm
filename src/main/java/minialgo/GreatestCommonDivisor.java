package minialgo;

/**
 * @author lianghong
 * @date 2019/11/9
 */

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int r1 = greatestCommonDivisor(36, 48);
        System.out.println("r1 = " + r1);
        int r2 = greatestCommonDivisor(12341234, 234324);
        System.out.println("r2 = " + r2);
        int r3 = greatestCommonDivisor(242424, 424242);
        System.out.println("r3 = " + r3);
        int r4 = greatestCommonDivisor(9999, 4444);
        System.out.println("r4 = " + r4);
        int r5 = greatestCommonDivisor(10000, 3000);
        System.out.println("r5 = " + r5);
    }

    public static int greatestCommonDivisor(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return greatestCommonDivisor(q, r);
    }
}
