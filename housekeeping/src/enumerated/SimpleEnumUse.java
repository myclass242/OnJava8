package enumerated;

public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness spiciness = Spiciness.HOT;
        System.out.println(spiciness);
        System.out.println(spiciness.ordinal());

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
