package com.zy.finall;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

class WithFinal {
    private final void f() {
        System.out.println("WithFinal.f()");
    }
    private void g() {
        System.out.println("WithFinal.g()");
    }
}

class OverridingPrivate1 extends WithFinal {
    private final void f() {
        System.out.println("OverridingPrivate1.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate1 {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op = new OverridingPrivate2();
        op.f();
        op.g();

        OverridingPrivate1 op1 = op;
//        op1.f();
        WithFinal wf = op;
//        wf.f();

        Vector v = new Vector();
        ArrayList al = new ArrayList();
        Hashtable ht = new Hashtable();
    }
}
