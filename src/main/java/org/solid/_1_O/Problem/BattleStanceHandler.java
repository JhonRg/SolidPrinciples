package org.solid._1_O.Problem;

public class BattleStanceHandler {
    private final Character character;

    public BattleStanceHandler(final Character character) { this.character = character; }

    /*
    OPEN-CLOSE VIOLATION
    Si añadimos una nueva estancia deberemos modificar la lógica de este método.
     */
    public void changeBattleStance(final BattleMode battleMode) {
        switch (battleMode) {
            case DEFENSIVE -> { character.modifyDefense(1.5); character.modifyAttack(0.5);break;}
            case OFFENSIVE -> { character.modifyDefense(0.5); character.modifyAttack(1.5);break;}
            case BALANCE -> { character.modifyDefense(1); character.modifyAttack(1);break;}
            default -> {System.out.println("BattleStance unknown: " + battleMode);}
        }
    }
}
