package com.enemyship.enemyshipbuilding;

public abstract class EnemyShip {
    private String name;
    private ESWeapon weapon;
    private ESEngine engine;


    abstract void makeShip();

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following hero at" + engine);
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + weapon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(ESWeapon weapon) {
        this.weapon = weapon;
    }

    public void setEngine(ESEngine engine) {
        this.engine = engine;
    }
}
