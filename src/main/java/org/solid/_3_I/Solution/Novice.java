package org.solid._3_I.Solution;

/**
 * INTERFACE SEGREGATION PRINCIPLE
 * We can provide Monk Class with multiples interfaces giving
 * a more complex behaviour without feed a single interface.
 *
 * A novice it's a simple Character (ICharacter) without
 * any special property.
 */
public class Novice implements ICharacter{
    @Override
    public void walk() {
        System.out.println("Novice walk");
    }

    @Override
    public void attack() {
        System.out.println("Novice attack");
    }

    @Override
    public void hurt() {
        System.out.println("Novice hurt");
    }
}
