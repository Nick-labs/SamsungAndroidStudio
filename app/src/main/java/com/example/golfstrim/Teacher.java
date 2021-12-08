package com.example.golfstrim;

public class Teacher {
    private String surname;
    private String name;
    private String patron;
    private String subject;

    public Teacher(String surname, String name, String patron, String subject) {
        this.surname = surname;
        this.name = name;
        this.patron = patron;
        this.subject = subject;
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

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFio() {
        return this.name + " " + this.surname + " " + this.patron;
    }

    public String toString() {
        return getFio() + " - преподаватель предмета " + this.subject;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void estimate(Student student) {
        int rating = getRandomNumber(2, 6);
        String strating = "неудовлетворительно";
        if (rating == 3) {
            strating = "удовлетворительно";
        } else if (rating == 4) {
            strating = "хорошо";
        } else if (rating == 5) {
            strating = "отлично";
        }

        System.out.println("Преподователь " + getFio() +
                " оценил студента с именем " + student.getFio() +
                " по предмету " + subject + " на оценку " + strating);
    }
}
