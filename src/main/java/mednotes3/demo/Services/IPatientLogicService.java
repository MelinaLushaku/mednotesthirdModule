package mednotes3.demo.Services;

import mednotes3.demo.Model.PatientEntity;
import mednotes3.demo.Model.Suggestion;

public interface IPatientLogicService {
    void addSuggestion(Suggestion s);
  PatientEntity pacientiE(int nrPersonal);
}
