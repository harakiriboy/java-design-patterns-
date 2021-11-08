package com.company;

public class Girl extends BasicStudent {

    public Girl(int newstudentage, int newstudentcourse) {
        studentAge = newstudentage;
        studentCourse = newstudentcourse;
    }

    @Override
    public void longhair() {
        System.out.println("With Long Hair");
    }

    @Override
    public void shorthair() {
        System.out.println("With Short Hair");
    }

    @Override
    public void studentAge() {
        if(studentAge > studentMaxAge || studentAge < 16) {
            System.out.println("Student cannot study");
        }
        System.out.println("Student age is: " + studentAge + ", and student in " + studentCourse + " course");
    }
}
