package com.zy.hiding.chocolate;

import com.zy.hiding.dessert.*;

public class ChocolateChip extends Cookie{
    public ChocolateChip() {
//        super(1);
        super(3.14);
        System.out.println("ChocolateChip()");
    }
    public void chomp() {
//        bite(3);
        super.bite(3);
    }

    public static void main(String[] args) {
        ChocolateChip chocolateChip = new ChocolateChip();
        chocolateChip.chomp();
//        new Test();
    }
}
