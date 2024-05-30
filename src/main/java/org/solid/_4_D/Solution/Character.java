package org.solid._4_D.Solution;

import org.solid._4_D.Problem.Health;
import org.solid._4_D.Problem.Level;

public class Character {
    public Level level;
    public Health health;

    /**
     * DEPENDENCY INVERSION SOLUTION
     * On this way Character depends on the concrete implementation.
     * Future changes on Level or Health could break or modify the
     * classes who depend on them.
     *
     * On the other hand we added accesibilty for test's class isolating
     * the behaviour. Using mock's class in the constructor call.
     */
    public Character(Level level, Health health){
        this.level = level;
        this.health = health;
    }
}
