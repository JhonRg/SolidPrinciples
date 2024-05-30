package org.solid._1_O.Solution;

public class Character {
    public final int baseAttack;
    public final int baseDefense;

    public int attack;
    public int defense;

    public Character (final int baseAttack, final int baseDefense){
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }
    public int getAttack(){return attack;}
    public int getDefense(){return defense;}
    public void modifyAttack(double modifier){this.attack = (int)(baseAttack*modifier);}
    public void modifyDefense(double modifier){this.defense = (int)(baseDefense*modifier);}
}
