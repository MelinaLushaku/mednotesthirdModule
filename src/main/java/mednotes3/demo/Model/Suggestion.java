package mednotes3.demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Suggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int suggestionId;

    @Column
    private String content;


    @Embedded
    private PatientEntity patientEntity;
    public Suggestion(){
    }

    public Suggestion( String content, PatientEntity patientEntity) {

        this.content = content;

        this.patientEntity=patientEntity;
    }

    public int getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(int suggestionId) {
        this.suggestionId = suggestionId;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public PatientEntity getPatientEntity() {
        return patientEntity;
    }

    public void setPatientEntity(PatientEntity patientEntity) {
        this.patientEntity = patientEntity;
    }
}
