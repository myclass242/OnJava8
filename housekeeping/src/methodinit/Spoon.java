package methodinit;

public class Spoon {
    static int i;
    static {
        i = 47;
    }
    public static void main(String[] args) {
        Spoon spoon = new Spoon();
        System.out.println(spoon.i);
    }
}
