package org.solid._2_L.Solution;

public class Character {
    public final int maxHp;
    public int actualHp;

    public int attack;

    public Character(final int maxHp) { this.maxHp = maxHp; }

    public void receiveDamage(int damage){
        this.actualHp -= damage;
        if(this.actualHp <= 0){ destroy(); }
    }
    public int getActualHp(){return this.actualHp; }
    protected void destroy(){
        //Destroy the character from the scene
    }
}
