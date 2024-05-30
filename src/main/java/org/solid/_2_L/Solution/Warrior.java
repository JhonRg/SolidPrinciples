package org.solid._2_L.Solution;

import org.solid._2_L.Solution.Character;


/**
 * Liskov Principle Solution
 * Add the IHostile for Character who can attack
 */
public class Warrior extends Character implements IHostile {

    public int weaponAttack;
    public int shieldDefense;

    public Warrior(int maxHp) {
        super(maxHp);
        this.weaponAttack = 0;
        this.shieldDefense = 0;
    }
    @Override
    public void receiveDamage(int amount){
        super.receiveDamage(amount-shieldDefense);
    }

    //Now we can add Hostile interface to Characters who need attack
    @Override
    public void attack(Character target){
        target.receiveDamage(this.attack+weaponAttack);
    }
}
