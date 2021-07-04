package mednotes3.demo.Controller;

import mednotes3.demo.Helper.PatientResponse;
import mednotes3.demo.Model.PatientEntity;
import mednotes3.demo.Model.Suggestion;
import mednotes3.demo.Services.IPatientLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api/patientLogicManagement")
public class PatientLogicController {
    @Autowired
private  IPatientLogicService pls;



    @PostMapping ("/addSuggestion/{content}/{personalN}")
    public PatientResponse addSuggestion(@PathVariable String content,  @PathVariable int personalN) {
        PatientEntity pEe=this.pls.pacientiE(personalN);

               this.pls.addSuggestion(content, personalN);
                return new PatientResponse.PatientResponseBuilder<>(202).setMesazhin("Suggestion sent").build();
        }

@GetMapping("/allSuggestions")
    public PatientResponse getAllSuggestions(){
        List<Suggestion>lista=this.pls.allSuggestions();
        if(lista.size()!=0){
            return new PatientResponse.PatientResponseBuilder<>(202).setMesazhin("Lista e sukseshme").setData(lista).build();

        }
        return new PatientResponse.PatientResponseBuilder<>(402).setErrorin("there are no sugesstions").build();
}

    @PostMapping("/deleteSuggestion/{sugId}")
    public PatientResponse deleteAdvice(@PathVariable int sugId) {
      Suggestion s=this.pls.getSuggestion(sugId);

        if (s != null) {
           this.pls.deleteSuggestion(s);

                return new PatientResponse.PatientResponseBuilder<>(202).setMesazhin("Suggestion deleted").build();
            }

        return new PatientResponse.PatientResponseBuilder<>(402).setErrorin("You didnt choose a suggestion!").build();

    }
}
