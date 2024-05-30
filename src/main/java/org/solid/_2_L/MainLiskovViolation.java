package org.solid._2_L;

import org.solid._2_L.Problem.*;

import java.awt.desktop.PrintFilesEvent;

public class MainLiskovViolation {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(100);
        Dummy dummy = new Dummy();
        warrior.receiveDamage(10);
        warrior.attack(dummy);

        System.out.println(
                "Warrior HP: " + warrior.getActualHp()
                + "Target Hp: " + dummy.getActualHp()
        );

        dummy.receiveDamage(10);
        // LISKOV VIOLATION \/
        try {
            dummy.attack(warrior);
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "Warrior HP: " + warrior.getActualHp()
                            + "Target Hp: " + dummy.getActualHp()
            );
        }
        /**
         * Attack on civils raise a RuntimeException.
         * It's true we can change the attack method logic on Civil,
         * but this is the main point to avoid using Liskov principle.
         * We should not to worry about Exceptions in Runtime.
         * BAD PRACTICE.
         */

    }
}