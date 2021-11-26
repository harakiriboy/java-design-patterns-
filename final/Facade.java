package com.company;

import com.company.Adapter.DoctorKitTools;
import com.company.Bridge.*;
import com.company.Factory.Ambulance;
import com.company.Factory.BusFactory;
import com.company.Factory.HelicopterFactory;
import com.company.Strategy.*;

import java.util.Scanner;

public class Facade {
    public void ruuun() {
        System.out.println("Patient come home and got a message that he has some illness");
        System.out.println("Lets create patient");
        Patient pat;
        System.out.println("input name and the type(human, animal or bird)");
        Scanner input = new Scanner(System.in);
        System.out.println("enter patient name: ");
        String patientname = input.nextLine();
        System.out.println("enter type: ");
        String type = input.nextLine();
        System.out.println("enter age: ");
        int age = Integer.parseInt(input.nextLine());
        if(type.equals("Human"))
            pat = new Human(patientname, type, age);
        else if(type.equals("Bird"))
            pat = new Birds(patientname, type, age);
        else if(type.equals("Animal"))
            pat = new Animal(patientname, type, age);
        else
            pat = new Human(patientname, type, age);
        System.out.println("lets identify with which type of disease our patient get sick");
        System.out.println("\nYou can choose between Clinical, Mental and Infection");
        String diseasetype = input.nextLine();
        switch (diseasetype) {
            case "Clinical" -> pat.setIllness(new Clinical());
            case "Mental" -> pat.setIllness(new Mental());
            case "Infection" -> pat.setIllness(new Infection());
        }
        pat.display();

        System.out.println("Lets identify where the call coming");
        System.out.println("\nYou can choose between City and Mountains");
        String location = input.nextLine();
        String amb;
        Ambulance ambulance;
        if(location.equals("City")){
            ambulance = new BusFactory();
            amb = "Bus";
        }
        else if(location.equals("Mountains")){
            ambulance = new HelicopterFactory();
            amb = "Helicopter";
        }
        else {
            ambulance = new BusFactory();
            amb = "Bus";
        }
        System.out.println("Ambulance created!!!");
        System.out.println(ambulance.createBody().InfoAboutBody());
        System.out.println(ambulance.createCabinets().InfoAboutCabinets());
        System.out.println(ambulance.createDoors().InfoAboutDoors());
        System.out.println(ambulance.createSeating().InfoAboutSetting());

        System.out.println("\nThe patient was arrived with "+ amb);
        System.out.println("\nNow lets find appropriate toolkit for doctor to heal the patient");
        System.out.println("\nChoose a doctor for heal (Surgeon, Neurologist):");
        DoctorKitTools doctorKitTools = new DoctorKitTools();

        doctorKitTools.Tools(input.nextLine());

        System.out.println("Now choose medicaments for patient");
        String medicament = input.nextLine();
        if(pat.age >= 18) {
            Medicament med = new Citramon(new SaleForPensioners());
            med.showdetails();
        }
        else if(pat.age < 18){
            Medicament med = new Aspirin(new FreeForKids());
            med.showdetails();
        }
    }
}
