package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior war = new Warrior() {
            @Override
            public void Super() {
                super.Super();
            }
        };
        Mental ment = new Mental();
        Magical mag = new Magical();
        war.setDamageHero(20);
        mag.setDamageHero(20);
        ment.setDamageHero(20);
        Warrior[] hero = {war, ment, mag};
        for (int i = 0; i < hero.length; i++) {
            hero[i].Super();
        }

    }
}
