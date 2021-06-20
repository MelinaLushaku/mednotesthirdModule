package mednotes3.demo.OutputAdapters;

import mednotes3.demo.Helper.DoctorHelper;
import mednotes3.demo.Model.DoctorEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class SystemManagementModuleService {
    public DoctorEntity doctorE(String name){
        RestTemplate restTemplate=new RestTemplate();
 String userServiceUrl="http://localhost:8090/api/systemManagement/doctor/searchDoctor/"+name;
        ResponseEntity<DoctorHelper>responseEntity=restTemplate.getForEntity(userServiceUrl,DoctorHelper.class);
        String nameDoc=responseEntity.getBody().getName();
        String surnameDoc=responseEntity.getBody().getSurname();
        return new DoctorEntity(nameDoc,surnameDoc);
    }
}
