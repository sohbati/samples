package com.enemyship;

import com.enemyship.enemyshipbuilding.EnemyShip;
import com.enemyship.enemyshipbuilding.EnemyShipBuilding;
import com.enemyship.enemyshipbuilding.UFOEnemyShipBuilding;

public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShipBuilding enemyShipBuilding = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = enemyShipBuilding.orderTheShip(EnemyShipBuilding.SHIP_TYPE_ENUM.UFO);
        System.out.println(theGrunt);

        EnemyShip theBoss = enemyShipBuilding.orderTheShip(EnemyShipBuilding.SHIP_TYPE_ENUM.BOS_UFO);
        System.out.println(theBoss);


    }
}
