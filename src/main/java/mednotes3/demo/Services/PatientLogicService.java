package mednotes3.demo.Services;

import mednotes3.demo.DAL.SuggestionRepository;
import mednotes3.demo.Model.Suggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientLogicService implements  IPatientLogicService{
    @Autowired
    private SuggestionRepository suggestionRepository;
    @Override
    public void addSuggestion(Suggestion s){
        this.suggestionRepository.save(s);
    }

    @Override
    public List<Suggestion> findByTitle(String title) {
        return this.suggestionRepository.findSuggestionByTitle(title);
    }

}
