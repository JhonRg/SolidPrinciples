package org.solid._0_S;

import org.solid._0_S.Problem.Character;

public class SingleResponsabilityViolation {
    public static void main(String[] args) {
        Character pnj = new Character(10);
        pnj.walk();
        pnj.attack();

        System.out.println("Salud: " + pnj.getActualHp());
        pnj.receiveDamage(5);
        System.out.println("Salud: " + pnj.getActualHp());
        pnj.heal(3);

        pnj.checkBag();
        pnj.store("Potion");
        pnj.checkBag();
    }
}
