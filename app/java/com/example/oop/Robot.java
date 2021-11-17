package com.example.oop;

public class Robot extends Unit {
    private int armor;

    public Robot(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    @Override
    public void defend() {
        System.out.println(
            "Я защищаюсь броней"
        );
    }
}
