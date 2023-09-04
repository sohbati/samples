package com.enemyship.enemyshipbuilding;

public class UFOBossEnemyShip extends EnemyShip {
    private final EnemyShipFactory shipFactory;
    public UFOBossEnemyShip(EnemyShipFactory shipPartsFactory) {
        this.shipFactory = shipPartsFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship: " + getName());
        setWeapon(shipFactory.addEsGun());
        setEngine(shipFactory.addEsEngine());
    }
}
