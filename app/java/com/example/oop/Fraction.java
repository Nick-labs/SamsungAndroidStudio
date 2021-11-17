package com.example.oop;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Fraction {
    private int numerator; // =0 по умолчанию
    private int denominator = 1;

    public Fraction(int n, int d) throws Exception {
        int gcd = Fraction.gcd(n, d);
        this.numerator = (n / gcd) * (d > 0 ? 1 : -1);
        this.setDenominator(Math.abs(d / gcd));
    }
    public Fraction(int n) {
        this.numerator = n;
    }
    public Fraction() {

    }
    public void setDenominator(int d) throws Exception {
        if (d != 0) {
            this.denominator = d;
        } else {
            throw new Exception("Zero denominator");
        }
    }
    public int getDenominator() {
        return this.denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public static int gcd(int n, int d) {
        n = Math.abs(n);
        d = Math.abs(d);
        while ( n != 0 && d != 0) {
            if (n > d) {
                n %= d;
            } else {
                d %= n;
            }
        }
        return n + d;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public Fraction add (Fraction f2) throws Exception {
        return new Fraction(
             this.numerator * f2.denominator +
                     f2.numerator * this.denominator  ,

             this.denominator * f2.denominator
        );
    }

    public boolean equals(Fraction f2) {
        return this.numerator == f2.numerator
                && this.denominator == f2.denominator;
    }
}
