package com.company.Observer;
import java.util.ArrayList;
import java.util.List;

public class Pharmacy implements Observed {
    List<String> medicaments = new ArrayList<>();
    List<Observer> patients = new ArrayList<>();

    public void addMedicament(String medicament){
        this.medicaments.add(medicament);
        notifyObservers();
    }

    public void removeMedicament(String medicament){
        this.medicaments.remove(medicament);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.patients.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.patients.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : patients){
            observer.EventHandle(this.medicaments);
        }
    }
}
