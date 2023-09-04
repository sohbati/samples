package com.enemyship.enemyshipbuilding;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addEsGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addEsEngine() {
        return new ESUFOBossEngine();
    }
}
