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
                Suggestion s=new Suggestion(content,pEe);
                this.pls.addSuggestion(s);
                return new PatientResponse.PatientResponseBuilder<>(202).setMesazhin("Suggestion sent").setData(s).build();
        }


}
