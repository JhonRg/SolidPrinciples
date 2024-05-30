package org.solid._2_L.Problem;

//El personaje del Warrior puede equipar armas y armaduras
public class Warrior extends Character{

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
    @Override
    public void attack(Character target){
        target.receiveDamage(this.attack);
    }

}
