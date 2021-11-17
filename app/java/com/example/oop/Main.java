package com.example.oop;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit("Tree", 100);
        Unit unit2 = new Unit("Air", 100);
        Robot r2d2 = new Robot("R2D2" , 100, 50);
        Wizard wizard = new Wizard("Gandalf", 100, 100);
        r2d2.attack(wizard);
        wizard.attack(r2d2);
    }
}
