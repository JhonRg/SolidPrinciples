package org.solid._3_I.Problem;

public class Warrior implements ICharacter{

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
        System.out.println("Meele Barrage");
    }

    @Override
    public void shieldUp() {
        System.out.println("Shield Up");
    }

    @Override
    public void heal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void holyLight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fireBall() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void thunderStorm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
