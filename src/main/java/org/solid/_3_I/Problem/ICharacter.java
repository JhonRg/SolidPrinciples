package org.solid._3_I.Problem;

/**
 * INTERFACE SEGREGATION PRINCIPLE VIOLATION
 * This fat interface violate the isp principle so we need
 * to split into small interfaces and let class to implements
 * multiple interface as they need.
 */
public interface ICharacter {
    public void walk();

    public void attack();
    public void hurt();

    public void meeleBarrage();
    public void shieldUp();

    public void heal();
    public void holyLight();

    public void fireBall();
    public void thunderStorm();

}
