package org.solid._3_I.Solution;

/**
 * INTERFACE SEGREGATION PRINCIPLE
 * We can provide Monk Class with multiples interfaces giving
 * a more complex behaviour without feed a single interface.
 *
 * A mage should be able to do Characters (ICharacter) actions in addition
 * to throw holy spells and special melee-battle actions.
 */
public class Monk implements ICharacter, IWarrior, IHealer{
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
    public void heal() {
        System.out.println("Healing");
    }

    @Override
    public void holyLight() {
        System.out.println("Holy Light");
    }

    @Override
    public void meeleBarrage() {
        System.out.println("Meele Barrage");
    }

    @Override
    public void shieldUp() {
        System.out.println("Shield Up");
    }
}
