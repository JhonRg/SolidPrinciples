package org.solid._1_O;

import org.solid._1_O.Problem.BattleMode;
import org.solid._1_O.Problem.BattleStanceHandler;
import org.solid._1_O.Problem.Character;

public class OpenClosedViolation {
    public static void main(String[] args) {
        Character pnj = new Character(10,10);
        BattleStanceHandler bsHandler = new BattleStanceHandler(pnj);

        printCharacterStatus(pnj);

        bsHandler.changeBattleStance(BattleMode.OFFENSIVE);
        printCharacterStatus(pnj);

        bsHandler.changeBattleStance(BattleMode.DEFENSIVE);
        printCharacterStatus(pnj);

        bsHandler.changeBattleStance(BattleMode.BALANCE);
        printCharacterStatus(pnj);

    }
    public static void printCharacterStatus(Character pnj){
        System.out.print(
                "Estadísticas del personaje:\n"+
                        "Ataque: " + pnj.getAttack()+
                        "Defensa: " + pnj.getDefense()
        );
    }
}
