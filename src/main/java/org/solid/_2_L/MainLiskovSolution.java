package org.solid._2_L;

import org.solid._2_L.Solution.Dummy;
import org.solid._2_L.Solution.Warrior;

public class MainLiskovSolution {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(10);
        Dummy dummy = new Dummy(100);
        warrior.receiveDamage(10);
        warrior.attack(dummy);

        System.out.println(
                "Warrior HP: " + warrior.getActualHp()
                        + "Target Hp: " + dummy.getActualHp()
        );

        dummy.receiveDamage(10);
        /**
         * Now the RUNTIME EXCEPTION is a compile Error
         * So we can avoid in compile time the exceptions
         * removing Runtime Exceptions from the application.
          */
        try {
            //Uncomment to check the Compile Error
//            dummy.attack(warrior);
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
