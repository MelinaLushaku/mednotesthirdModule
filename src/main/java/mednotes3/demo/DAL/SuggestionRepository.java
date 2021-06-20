package mednotes3.demo.DAL;

import mednotes3.demo.Model.DoctorEntity;
import mednotes3.demo.Model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SuggestionRepository extends JpaRepository<Suggestion, Integer> {
    @Query("select a from Suggestion a where a.title=?1")
    List<Suggestion> findSuggestionByTitle(String title);

}
