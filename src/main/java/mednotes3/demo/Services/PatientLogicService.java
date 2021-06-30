package mednotes3.demo.Services;

import mednotes3.demo.DAL.SuggestionRepository;
import mednotes3.demo.Model.PatientEntity;
import mednotes3.demo.Model.Suggestion;
import mednotes3.demo.OutputAdapters.SystemManagementModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientLogicService implements  IPatientLogicService{
    @Autowired
    private SystemManagementModuleService smms;
    @Autowired
    private SuggestionRepository suggestionRepository;
    @Override
    public void addSuggestion(Suggestion s){
        this.suggestionRepository.save(s);
    }

    @Override
    public PatientEntity pacientiE(int nrPersonal){

        return this.smms.pacientiE(nrPersonal);
    }

}
