package com.zy.delegation;

public class DrivedSpaceShip extends SpaceShipControls {
    private String name;
    public DrivedSpaceShip(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
    public static void main(String[] args) {
        DrivedSpaceShip drivedSpaceShip = new DrivedSpaceShip("神舟");
        drivedSpaceShip.forward(100);
    }
}
