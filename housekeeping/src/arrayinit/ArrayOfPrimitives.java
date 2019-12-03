package arrayinit;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;

        for (int i = 0; i < a2.length; ++i) {
            a2[i] += 1;
        }
        for (int i = 0; i < a1.length; ++i) {
            System.out.println(a1[i]);
        }

        int[] a3;
        Random rand = new Random(47);
        a3 = new int[rand.nextInt(20)];
        System.out.println("length of a3 is " + a3.length);
        System.out.println(Arrays.toString(a3));

        Integer[] a = {1, 2, 3};
        Integer[] b = new Integer[]{1, 2, 3};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
