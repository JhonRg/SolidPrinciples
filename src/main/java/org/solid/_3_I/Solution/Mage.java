package org.solid._3_I.Solution;

import org.solid._3_I.Solution.ICharacter;
import org.solid._3_I.Solution.IMage;

/**
 * INTERFACE SEGREGATION PRINCIPLE
 * We can provide Mage Class with multiples interfaces giving
 * a more complex behaviour without feed a single interface.
 *
 * A mage should be able to do Characters (ICharacter) actions in addition
 * to throw powerful spells (IMage)
 */
public class Mage implements ICharacter, IMage {
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
    public void fireBall() {
        System.out.println("Fire Ball");
    }

    @Override
    public void thunderStorm() {
        System.out.println("Thunder Storm");
    }
}
