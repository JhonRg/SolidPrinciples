package org.solid._1_O.Solution;

/**
 * OPEN-CLOSE SOLUTION APPLIED
 * Si queremos añadir una nueva estancia de combate
 * lo haremos creando una nueva clase sin tener que modificar
 * código ya existente
 */

public final class AttackStance implements BattleStance {
    private static final double attackModifier = 1.5;
    private static final double defenseModifier = 0.5;
    @Override
    public double getAttack() {
        return attackModifier;
    }
    @Override
    public double getDefense() {
        return defenseModifier;
    }
}
