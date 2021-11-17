package com.example.oop;

public class Wizard extends Unit{
    private int mana;

    public Wizard(String name, int hp, int mana) {
        super(name, hp);
        this.mana = mana;
    }


    @Override
    public void defend() {
        if (mana > 0) {
            mana-=5;
            System.out.println(
                    "Я защищаюсь маной"
            );
        } else {
            super.defend();
        }
    }
}
