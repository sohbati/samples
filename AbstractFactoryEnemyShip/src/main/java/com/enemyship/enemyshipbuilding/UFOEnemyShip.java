package com.enemyship.enemyshipbuilding;

public class UFOEnemyShip extends EnemyShip {
    private final EnemyShipFactory shipFactory;
    public UFOEnemyShip(EnemyShipFactory shipPartsFactory) {
        this.shipFactory = shipPartsFactory;
    }


    @Override
    public void makeShip() {
        System.out.println("Making enemy ship" + getName());

        setWeapon(shipFactory.addEsGun());
        setEngine(shipFactory.addEsEngine());
    }
}
