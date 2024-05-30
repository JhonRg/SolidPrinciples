package org.solid._0_S.Problem2;

public class SingleResponsabilityProblem {
    public static void main(String[] args) {
        Character npc = new Character();
        Character warrior = new Character();

        npc.walk();
        npc.hurt();
        npc.attack(); // NPC's shouldnt attack
        npc.fly(); // Either can't fly!
        /** SRP VIOLATION
         * Podríamos restringir por código o en la implementación
         * que los Character de tipo npc no puedan volar. Pero no
         * estariamos abarcando el problema a nivel de diseño sino
         * de implementación.
         */
        warrior.fireball();// SRP VIOLATION

    }
}
