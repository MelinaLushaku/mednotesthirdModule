package mednotes3.demo.OutputAdapters;

import mednotes3.demo.Model.DoctorEntity;
import mednotes3.demo.Model.PatientEntity;

public interface iSystemManagemntModuleService {
    PatientEntity pacientiE(int nrPersonal);
    DoctorEntity doctorE(String name);
}
