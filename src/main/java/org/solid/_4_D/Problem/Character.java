package org.solid._4_D.Problem;

public class Character {
    public Level level;
    public Health health;

    /**
     * DEPENDENCY INVERSION VIOLATION
     * On this way Character depends on the concrete implementation.
     * Future changes on Level or Health could break or modify the
     * classes who depend on them.
     *
     * This method implementation difficult the unit testing doing
     * more difficult to isolate the test of dependencies
     */
    public Character(){
        this.level = new Level();
        this.health = new Health();
    }
}
