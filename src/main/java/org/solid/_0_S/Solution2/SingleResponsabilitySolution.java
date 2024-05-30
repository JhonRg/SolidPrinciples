package org.solid._0_S.Solution2;

public class SingleResponsabilitySolution {
    public static void main(final String[] args) {
        Character npc = new Character();
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Healer healer = new Healer();

        npc.walk();
        npc.hurt();
        //SRP SOLUTION at compile time
        //npc.attack();

        warrior.attack();

        mage.fly();
        mage.fireball();

        healer.heal();
    }
}
