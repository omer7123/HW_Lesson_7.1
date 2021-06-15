package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior war = new Warrior() {
            @Override
            public void Super() {
                super.Super();
            }

            @Override
            public int getDamageHero() {
                return super.getDamageHero();
            }

            @Override
            public void setDamageHero(int damageHero) {
                super.setDamageHero(damageHero);
            }

            @Override
            public int getHealthHero() {
                return super.getHealthHero();
            }

            @Override
            public void setHealthHero(int healthHero) {
                super.setHealthHero(healthHero);
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
        System.out.println();
    }
}
