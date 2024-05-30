package org.solid._0_S.Problem;

import java.util.List;

public interface ICharacter {
    public void walk();
    public void attack();
    public void receiveDamage(int damage);

    /**
     * Single Responsability Principle Violation
     *  We could uncouple the healing and storing behaviour
     *  Therefore, futures implementations can decide
     *  if they would inherit the behaviour they can do it in a
     *  more uncoupled.
     *
     *
     * @param amount
     */
    public void heal(int amount);
    public void store(String item);
    public void checkBag();
}
