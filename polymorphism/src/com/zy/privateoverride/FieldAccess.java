package com.zy.privateoverride;

class Super {
    public int field = 0;
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;
    @Override
    public int getField() {
        return field;
    }
    public int getSuperFiled() {
//        return super.getField();
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub(); // upcast
        System.out.println("sup.field=" + sup.field + ",sup.getField()=" + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field=" + sub.field + ",sub.getField()=" + sub.getField() + ",sub.getSuperFiled()=" + sub.getSuperFiled());
    }
}
