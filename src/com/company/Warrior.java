package com.company;

import java.util.Random;

public abstract class Warrior implements Super {
    private int healthHero;
    private int damageHero;


    @Override
    public void Super() {
        Random Ran1 = new Random();
        int koeff = Ran1.nextInt(3);
        if (koeff == 1) {
            System.out.println("War нанес критический удар: " + getDamageHero() * 3);
        }else {
            System.out.println("War нанес обычный удар: " + getDamageHero());
        }

    }


    public int getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(int damageHero) {
        this.damageHero = damageHero;
    }

    public int getHealthHero() {

        return healthHero;
    }

    public void setHealthHero(int healthHero) {

        this.healthHero = healthHero;
    }
}
