package mednotes3.demo.Controller;

import mednotes3.demo.Helper.PatientResponse;
import mednotes3.demo.Helper.SuggestionHelper;
import mednotes3.demo.Model.Suggestion;
import mednotes3.demo.Services.IPatientLogicService;
import mednotes3.demo.Services.PatientLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patientLogicManagement")
public class PatientLogicController {
    @Autowired
private  IPatientLogicService pls;



    @PostMapping("/patient/addSuggestionn")
    public PatientResponse addSuggestion(@RequestBody SuggestionHelper suggestionHelper) {
        List<Suggestion> lista = this.pls.findByTitle(suggestionHelper.getTitle());
        if (lista.size() == 0) {
            Suggestion s = new Suggestion(suggestionHelper.getTitle(), suggestionHelper.getContent(), suggestionHelper.getDate());
            this.pls.addSuggestion(s);
            return new PatientResponse.PatientResponseBuilder<>(403).setMesazhin("Suggestion sent!").build();


        }else if (suggestionHelper.getTitle()==null) {
            return new PatientResponse.PatientResponseBuilder<>(403).setErrorin("Please fill all the inputs").build();
        }
        else if (suggestionHelper.getContent()==null){
        return new PatientResponse.PatientResponseBuilder<>(403).setErrorin("Please fill all the inputs").build();

        }
        return new PatientResponse.PatientResponseBuilder<>(403).setErrorin("Suggestion was sent").build();
    }


}
