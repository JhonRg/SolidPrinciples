package org.solid._0_S.Solution;

public class Character implements ICharacter {
    public int maxHp;
    public int actualHp;
    public Bag bag;

    public Character(final int maxHp) {
        this.maxHp = maxHp;
        actualHp = maxHp;
        bag = new Bag();
    }
    public int getMaxHp() {return maxHp;}
    public int getActualHp() {return actualHp;}
    public void setActualHp(int actualHp) {this.actualHp = actualHp;}

    @Override
    public void walk() {
        System.out.println("The character is walking");
    }

    @Override
    public void attack() {
        System.out.println("The character is attacking");
    }

    @Override
    public void receiveDamage(int damage) {
        this.actualHp -= damage;
    }
    public Bag getBag() {return bag;}
}
