package equivalance;

public class Equivalance {
    public static void main(String[] args) {
        Integer i1 = 47;
        Integer i2 = 47;
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1.equals(i2));
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));
    }
}

class Value {
    int i;

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }

        if (anObject instanceof Value) {
            Value anValue = (Value)anObject;
            return i == anValue.i;
        }

        return false;
    }
}