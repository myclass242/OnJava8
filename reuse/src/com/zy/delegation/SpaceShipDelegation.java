package com.zy.delegation;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls spaceShipControls =
            new SpaceShipControls();
    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        spaceShipControls.up(velocity);
    }
    public void down(int velocity) {
        spaceShipControls.down(velocity);
    }
    public void left(int velocity) {
        spaceShipControls.left(velocity);
    }
    public void right(int velocity) {
        spaceShipControls.right(velocity);
    }
    public void forward(int velocity) {
        spaceShipControls.forward(velocity);
    }
    public void back(int velocity) {
        spaceShipControls.back(velocity);
    }

    public void turboBoost() {
        spaceShipControls.turboBoost();
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation = new SpaceShipDelegation("神舟");
        spaceShipDelegation.forward(100);
        System.out.println(spaceShipDelegation);
    }
}
