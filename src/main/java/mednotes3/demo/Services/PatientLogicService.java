package mednotes3.demo.Services;

import mednotes3.demo.DAL.SuggestionRepository;
import mednotes3.demo.Model.PatientEntity;
import mednotes3.demo.Model.Suggestion;
import mednotes3.demo.OutputAdapters.SystemManagementModuleService;
import mednotes3.demo.OutputAdapters.iSystemManagemntModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientLogicService implements  IPatientLogicService{
    @Autowired
    private iSystemManagemntModuleService smms;
    @Autowired
    private SuggestionRepository suggestionRepository;


    @Override
    public void addSuggestion(String content,int nrPersonal){
        PatientEntity pE=this.smms.pacientiE(nrPersonal);
        Suggestion s=new Suggestion(content,pE);
        this.suggestionRepository.save(s);
    }

    @Override
    public void deleteSuggestion(String content , int patientPersonalNr){
        PatientEntity pat=this.smms.pacientiE(patientPersonalNr);
        Suggestion s=this.suggestionRepository.findSuggestionByPat(patientPersonalNr);
        this.suggestionRepository.delete(s);

    }



    @Override
    public PatientEntity pacientiE(int nrPersonal){

      PatientEntity patE=this.smms.pacientiE(nrPersonal);
      return patE;
    }
    @Override
    public List<Suggestion> allSuggestions(){return this.suggestionRepository.findAll();}

}
