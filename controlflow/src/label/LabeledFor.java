// For loops with "label break"/"label continue"

package label;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for(;true;) {
            inner:
            for (; i < 10; ++i) {
                System.out.println("i=" + i);
                if (2 == i) {
                    System.out.println("continue");
                    continue;
                }
                if (3 == i) {
                    System.out.println("break");
                    ++i;
                    break;
                }
                if (7 == i) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (8 == i) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; ++k) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
