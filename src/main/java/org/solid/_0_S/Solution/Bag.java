package org.solid._0_S.Solution;

import java.util.List;

public class Bag implements IBag {
    public int capacity;
    public List<String> bag;

    public Bag() {this.capacity = 5;}
    @Override
    public void store(String item) {
        if(bag.size() < capacity){
            bag.add(item);
        }else{
            System.out.println("La bolsa está llena");
        }
    }

    @Override
    public void checkBag() {
        System.out.println("Inventario:");
        bag.forEach(System.out::println);
    }
}
