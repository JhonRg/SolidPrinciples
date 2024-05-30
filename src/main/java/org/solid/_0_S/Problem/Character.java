package org.solid._0_S.Problem;

import java.util.ArrayList;
import java.util.List;

//La clase jugador se encarga de almacenar y modificar la información de la salud del personaje**
public class Character implements ICharacter {

    public int maxHp;
    public int actualHp;
    public int capacity;
    public List<String> bag;

    public Character(final int maxHp) {
        this.maxHp = maxHp;
        actualHp = maxHp;
        capacity = 10;
        bag = new ArrayList<>();
    }
    public int getMaxHp() {return maxHp;}
    public int getActualHp() {return actualHp;}
    public void setActualHp(int actualHp) {this.actualHp = actualHp;}

    @Override
    public void walk() {
        System.out.println("The character is walking");
    }

    @Override
    public void attack() {
        System.out.println("The character attacks");
    }

    @Override
    public void receiveDamage(int damage) {
        this.actualHp -= damage;
    }

    /**
     * Este método NO debería pertenecer a la clase personaje.
     *  La responsabilidad de la clase personaje es almacenar y modificar información de la salud
     *  El método heal, se está encargando de la lógica de negocio para curar a un personaje,
     *      que no está relacionada con la lógica única de personaje**.
     *  Por tanto debemos aislar este comportamiento para cumplir con el SRP.
     */
    public void heal(int amount){
        int lostLife = maxHp - actualHp;
        int realAmount = lostLife > amount ? amount : lostLife;
        this.actualHp += realAmount;
    }

    @Override
    public void store(String item) {
        if(bag.size() < capacity){
            bag.add(item);
            System.out.println("Stored " + item + " into the bag");
        }else{
            System.out.println("La bolsa está llena");
        }
    }
    @Override
    public void checkBag(){
        System.out.println("Inventario: " + bag.size() + "/" + capacity );
        bag.forEach(System.out::println);
    }
}
