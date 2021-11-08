package com.company;

abstract class BasicStudent {
    public int studentAge;
    public int studentCourse;
    public int studentMaxCourse = 3;
    public int studentMaxAge = 30;

    public abstract void longhair();
    public abstract void shorthair();

    public void studentAge() {
        if(studentAge > studentMaxAge || studentAge < 16) {
            System.out.println("Student cannot study");
        }
        System.out.println("Student age is: " + studentAge + ", and student in " + studentCourse + " course");
    }
}
