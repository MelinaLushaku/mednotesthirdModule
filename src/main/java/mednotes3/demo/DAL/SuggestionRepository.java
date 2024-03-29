package mednotes3.demo.DAL;

import mednotes3.demo.Model.PatientEntity;
import mednotes3.demo.Model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SuggestionRepository extends JpaRepository<Suggestion, Integer> {


@Query("select s from Suggestion s where s.patientEntity.patientPersonalNumber=?1")
    Suggestion findSuggestionByPat(int personalN);
@Query("select  s from Suggestion s where s.patientEntity.patientPersonalNumber=?1")
    List<Suggestion>existsSuggestion(int personalN);
}
