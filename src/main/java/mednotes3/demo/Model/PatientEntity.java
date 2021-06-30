package mednotes3.demo.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PatientEntity {


    private String patientName;
    private String patientSurname;

    // @Column(name="doctorPersonalNumber")
    @Column(nullable=true)
    private int patientPersonalNumber;

    public PatientEntity() {
    }

    public PatientEntity(String patientName, String patientSurname , int patientPersonalNumber) {
        this.patientName =patientName;
        this.patientSurname = patientSurname;
        this.patientPersonalNumber = patientPersonalNumber;

    }

    public PatientEntity(String namePat, String surnamePat) {
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientPersonalNumber(int patientPersonalNumber) {
        this.patientPersonalNumber = patientPersonalNumber;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public int getPatientPersonalNumber() {
        return patientPersonalNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }
}
