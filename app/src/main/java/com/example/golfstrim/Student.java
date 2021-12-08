package com.example.golfstrim;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Student implements Parcelable {
    private String surname;
    private String name;
    private String patron;
    private String grade;
    private String letter;

    public Student(String surname, String name, String patron, String grade, String letter) {
        this.surname = surname;
        this.name = name;
        this.patron = patron;
        this.grade = grade;
        this.letter = letter;
    }

    private Student(Parcel in) {
        this.surname = in.readString();
        this.name = in.readString();
        this.patron = in.readString();
        this.grade = in.readString();
        this.letter = in.readString();
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getFio() {
        return this.surname + " " + this.name + " " + this.patron;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(surname);
        out.writeString(name);
        out.writeString(patron);
        out.writeString(grade);
        out.writeString(letter);

    }
    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
//    public String toString() {}
}
