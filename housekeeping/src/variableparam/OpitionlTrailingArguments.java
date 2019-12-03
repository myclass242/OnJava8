package variableparam;

public class OpitionlTrailingArguments {
    static void f(int required, String... trailings) {
        System.out.print("required " + required + " ");
        for (String s : trailings) {
            System.out.print(s);
        }
        System.out.println();

        System.out.println(trailings.getClass());
        System.out.println(trailings.length);
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "one", "three");
        f(0);
    }
}
