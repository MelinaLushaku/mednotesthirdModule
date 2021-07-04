package mednotes3.demo.Services;

import mednotes3.demo.DAL.SuggestionRepository;
import mednotes3.demo.Model.PatientEntity;
import mednotes3.demo.Model.Suggestion;
import mednotes3.demo.OutputAdapters.SystemManagementModuleService;
import mednotes3.demo.OutputAdapters.iSystemManagemntModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void deleteSuggestion(Suggestion s){
          this.suggestionRepository.delete(s);

    }



    @Override
    public PatientEntity pacientiE(int nrPersonal){

      PatientEntity patE=this.smms.pacientiE(nrPersonal);
      return patE;
    }
    @Override
    public List<Suggestion> allSuggestions(){return this.suggestionRepository.findAll();}

    @Override
    public Suggestion getSuggestion(int suggId){
        Optional<Suggestion> sug=this.suggestionRepository.findById(suggId);
        return sug.get();
    }

}
