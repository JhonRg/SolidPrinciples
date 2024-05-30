package org.solid._2_L.Problem;

public abstract class Character {
    public final int maxHp;
    public int actualHp;

    public int attack;

    public Character(final int maxHp) { this.maxHp = maxHp; }

    public void receiveDamage(int damage){
        this.actualHp -= damage;
        if(this.actualHp <= 0){ destroy(); }
    }
    public int getActualHp(){return this.actualHp; }
    //All new characters are able to attack and need to implements the behaivour.
    public abstract void attack(Character enemy);

    protected void destroy(){}
}
