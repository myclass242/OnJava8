package literals;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1:" + Integer.toBinaryString(i1));
        int i3 = 0177;
        System.out.println("i3:" + Integer.toBinaryString(i3));
        char c = 0xffff;
        System.out.println("c:" + Integer.toBinaryString(c));
        byte b = 0x7f;
        System.out.println("b:" + Integer.toBinaryString(b));
        short s = 0x7fff;
        System.out.println("s:" + Integer.toBinaryString(s));

        byte blb = (byte)0b00110101;
        System.out.println("blb:" + Integer.toBinaryString(blb));

        float f1 = 1;
        float f2 = 1f;
        float f3 = 1F;

        double d1 = 1;
        double d2 = 1d;
        double d3 = 1D;

        long l1 = 1;
        long l2 = 1l;
        long l3 = 1L;


        double d = 341_435_936.445_667;
        System.out.println(d);

        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);

        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
    }
}
