package org.solid._1_O.Solution;

/**
 * OPEN-CLOSED Solution
 * El Handler es agnósitco de las estancias,
 * de tal módo que no deberá ser modificado para añadir
 * nuevas instancias.
 */
public class StanceHandler {
    private final Character character;

    public StanceHandler(final Character character) {this.character = character;}

    public void changeBattleStance(final BattleStance battleStance){
        character.modifyAttack(battleStance.getAttack());
        character.modifyDefense(battleStance.getDefense());
    }
}
