package org.solid._2_L.Problem;

//El personaje Civil, no puede atacar y tan sólo puede recibir daño aunque lo hace de forma reducida
public class Dummy extends Character{
    public double defenseModifier = 0.5;
    public Dummy(int maxHp) {
        super(maxHp);
    }

    public Dummy() {
        super(100);
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage((int)(damage*defenseModifier));
    }

    /**
     * This is the Liskov Principle violation.
     * Civil has no reason to have the attack method.
     */

    @Override
    public void attack(Character enemy){
        throw new UnsupportedOperationException("Civil should not attack!");
    }

}
