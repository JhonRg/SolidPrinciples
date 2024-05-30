package org.solid._1_O;

import org.solid._1_O.Problem.BattleMode;
import org.solid._1_O.Solution.*;
import org.solid._1_O.Solution.Character;

public class OpenClosedSolution {
    public static void main(final String[] args) {
        Character pnj = new Character(10, 10);
        StanceHandler stanceHandler = new StanceHandler(pnj);

        printCharacterStatus(pnj);

        AttackStance attackStance = new AttackStance();
        stanceHandler.changeBattleStance(attackStance);

        DefenseStance defenseStance = new DefenseStance();
        stanceHandler.changeBattleStance(defenseStance);

        BalanceStance balanceStance = new BalanceStance();
        stanceHandler.changeBattleStance(balanceStance);
    }
    public static void printCharacterStatus(Character pnj){
        System.out.print(
                "Estadísticas del personaje:\n"+
                        "Ataque: " + pnj.getAttack()+
                        "Defensa: " + pnj.getDefense()
        );
    }
}
