package com.company;

import java.util.Random;

public class Magical extends Warrior{
    @Override
    public void Super() {
        Random Ran1 = new Random();
        int koeff = Ran1.nextInt(3);
        if (koeff == 1) {
            System.out.println("Маг нанес критический удар: " + getDamageHero() * 3);
        }else {
            System.out.println("Маг нанес обычный удар: " + getDamageHero());
        }

    }
}
