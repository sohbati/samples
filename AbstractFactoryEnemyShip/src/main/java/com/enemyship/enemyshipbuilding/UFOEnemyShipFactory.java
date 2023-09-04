package com.enemyship.enemyshipbuilding;

public class UFOEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addEsGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addEsEngine() {
        return new ESUFOEngine();
    }
}
