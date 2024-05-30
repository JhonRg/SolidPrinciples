package org.solid._1_O.Solution;

/**
 * OPEN-CLOSE SOLUTION APPLIED
 * Si queremos añadir una nueva estancia de combate
 * lo haremos creando una nueva clase sin tener que modificar
 * código ya existente
 */
public final class DefenseStance implements BattleStance {
    private static final double attackModifier = 0.5;
    private static final double defenseModifier = 1.5;
    @Override
    public double getAttack() {
        return attackModifier;
    }
    @Override
    public double getDefense() {
        return defenseModifier;
    }
}
