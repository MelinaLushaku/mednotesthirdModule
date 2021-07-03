package mednotes3.demo.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PatientEntity {


    private String patientName;
    private String patientSurname;
    private String patientEmail;

    // @Column(name="doctorPersonalNumber")
    @Column(nullable=true)
    private int patientPersonalNumber;

    public PatientEntity() {
    }

    public PatientEntity(String patientName, String patientSurname , int patientPersonalNumber,String patientEmail) {
        this.patientName =patientName;
        this.patientSurname = patientSurname;
        this.patientPersonalNumber = patientPersonalNumber;
        this.patientEmail=patientEmail;

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

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }
}
