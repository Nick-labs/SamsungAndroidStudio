package com.example.oop;

public class FractionMain {
    public static void main(String[] args) throws Exception {
        Fraction f =
            new Fraction(5,10);
        System.out.println(f.getDenominator());
        f.setDenominator(2);
        System.out.println(f.getDenominator());
        System.out.println(f);
        System.out.println(Fraction.gcd(7, 22));
        Fraction f2 =
            new Fraction();
        Fraction f3 =
            new Fraction(-7, 21);
        System.out.println(f3);

        Fraction f4 =
                new Fraction(7, -21);
        System.out.println(f4.add(f3));
        System.out.println(f3.add(f4));
        System.out.println(f3.equals(f4));
        System.out.println(f3 == f4 );
    }
}
