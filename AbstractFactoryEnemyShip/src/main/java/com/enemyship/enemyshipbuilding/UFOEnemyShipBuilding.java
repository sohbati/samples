package com.enemyship.enemyshipbuilding;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(SHIP_TYPE_ENUM shipType) {
        EnemyShip theEnemyShip;

        if (shipType == SHIP_TYPE_ENUM.UFO) {
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        }else if (shipType == SHIP_TYPE_ENUM.BOS_UFO) {
            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Grunt Ship");
        }else {
            throw new RuntimeException(
                    "Ship type factory you are looking for, has not been funded yet:" + shipType);
        }

        return theEnemyShip;
    }
}
