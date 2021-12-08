package com.example.golfstrim;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher t = new Teacher("Иванов", "Иван","Иванович", "математика");
        Student s = new Student("Петров","Петр","Петрович","10","а");
        t.estimate(s);
    }
}
