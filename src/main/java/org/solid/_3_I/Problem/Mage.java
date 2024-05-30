package org.solid._3_I.Problem;

public class Mage implements ICharacter{
    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void attack() {
        System.out.println("Attacking");
    }

    @Override
    public void hurt() {
        System.out.println("Hurting");
    }

    @Override
    public void meeleBarrage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void shieldUp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void heal() {
        System.out.println("Healing");
    }

    @Override
    public void holyLight() {
        System.out.println("Holy Light");
    }

    @Override
    public void fireBall() {
        System.out.println("Fire Ball");
    }

    @Override
    public void thunderStorm() {
        System.out.println("Thunder Storm");
    }
}
