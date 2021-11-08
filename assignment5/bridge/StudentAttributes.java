package com.company;

public abstract class StudentAttributes {
    private BasicStudent theBasicStudent;

    public StudentAttributes(BasicStudent newBasicStudent){
        theBasicStudent = newBasicStudent;
    }

    public void longhair() {
        theBasicStudent.longhair();
    }

    public void shorthair() {
        theBasicStudent.shorthair();
    }

    public void StudentAge() {
        theBasicStudent.studentAge();
    }


    public abstract void withtablet();


}
