package literals;

import java.math.BigInteger;

public class Exponents {
    public static void main(String[] args) {
        float expFloat = 1.39e-43f;
        System.out.println(expFloat);

        double expDouble = 47e47d;
        expDouble = 47e47;
        System.out.println(expDouble);

        double above = 0.7;
        double below = 0.4;
        float fabove = .7f;
        float fbelow = 0.4f;
        System.out.println(above + "," + below + "," + fabove + "," + fbelow);
        System.out.println((int)above + "," + (int)below + "," + (int)fabove + "," + (int)fbelow);
        System.out.println(Math.round(above) + "," + Math.round(below) + "," + Math.round(fabove) + "," + Math.round(fbelow));

        short s1 = 3, s2 = 4;
        short s3 = (short)(s1*s2);
        System.out.println(s3);

        int i1 = Integer.MAX_VALUE;
        for (int k = 0; k < 16; ++k) {
            System.out.println(Integer.toHexString(i1 + k) + ", " + (i1 + k));
        }
        System.out.println(4*i1);
    }
}
