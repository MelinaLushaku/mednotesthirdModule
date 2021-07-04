package mednotes3.demo.Services;

import mednotes3.demo.Model.PatientEntity;
import mednotes3.demo.Model.Suggestion;

import java.util.List;

public interface IPatientLogicService {
    void addSuggestion(String content,int patientPersonal);
  PatientEntity pacientiE(int nrPersonal);
List<Suggestion> allSuggestions();
    void deleteSuggestion( Suggestion s);
    Suggestion getSuggestion(int suggId);
}
