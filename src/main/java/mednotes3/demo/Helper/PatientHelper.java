package mednotes3.demo.Helper;

import java.io.Serializable;

public class PatientHelper implements Serializable {

    private String name;
    private String surname;
private int personalNumber;

    public PatientHelper() {
    }

    public PatientHelper(String name, String surname, int personalNumber) {
        this.name = name;
        this.surname = surname;
this.personalNumber=personalNumber;
    }
    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }
}