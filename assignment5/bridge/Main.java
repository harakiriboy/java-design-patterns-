package com.company;

public class Main {
    public static void main(String[] args) {
        StudentAttributes stud1 = new WithLaptop(new Girl(18,2));
        StudentAttributes stud2 = new WihtoutLaptop(new Girl(20, 3));
        StudentAttributes stud3 = new WihtoutLaptop(new Boy(17, 1));

        System.out.println("Student 1: Girl with laptop");
        //calling methods to add features to our objects
        stud1.longhair();
        stud1.withtablet();
        stud1.StudentAge();

        System.out.println("\nStudent 2: Girl with No laptop");
        stud2.shorthair();
        stud2.withtablet();
        stud2.StudentAge();

        System.out.println("\nStudent 3: Boy with No laptop");
        stud3.shorthair();
        stud3.withtablet();
        stud3.StudentAge();
    }
}
