package com.enemyship.enemyshipbuilding;

public abstract class EnemyShipBuilding {
    public enum SHIP_TYPE_ENUM {UFO, BOS_UFO}

    protected abstract EnemyShip makeEnemyShip(SHIP_TYPE_ENUM shipType);
    public EnemyShip orderTheShip(SHIP_TYPE_ENUM shipType) {
        EnemyShip theEnemyShip = makeEnemyShip(shipType);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;
    }
}
