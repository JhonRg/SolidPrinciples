package org.solid._2_L.Solution;

//El personaje Civil, no puede atacar y tan sólo puede recibir daño aunque lo hace de forma reducida
public class Dummy extends Character {
    public double defenseModifier = 0.5;
    public Dummy(int maxHp) {
        super(maxHp);
    }
    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage((int)(damage*defenseModifier));
    }

    /**
     * After the aplicattion of Liskov Principle
     * we add the attack property to an external interface.
     * So we have now a correct abstraction of the solution.
     */
//    @Override
//    public void attack(Character enemy){
//        throw new UnsupportedOperationException("Civil should not attack!");
//    }

}
