package org.solid._3_I.Solution;

/**
 * INTERFACE SEGREGATION PRINCIPLE SOLUTION
 * We have slice ICharacter interface into small one, giving
 * to each one a single responsability (SRP in SOLID).
 *
 * On the other hand, segregating interface we can provide
 * a more clearly and maintainability Class.
 */
public interface ICharacter {
    public void walk();

    public void attack();
    public void hurt();
}
