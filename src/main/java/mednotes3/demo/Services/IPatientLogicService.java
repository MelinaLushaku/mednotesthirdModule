package mednotes3.demo.Services;

import mednotes3.demo.Model.Suggestion;

import java.util.List;

public interface IPatientLogicService {
    void addSuggestion(Suggestion s);
    List<Suggestion>findByTitle(String title);
}
