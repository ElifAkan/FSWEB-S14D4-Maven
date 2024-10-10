package org.example.model.rpg;

public interface Poisonable {
    default double poison(){
        return Constant.POISIN_PERCENTAGE;
    }
}
