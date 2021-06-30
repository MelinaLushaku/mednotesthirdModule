package mednotes3.demo.DAL;

import mednotes3.demo.Model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionRepository extends JpaRepository<Suggestion, Integer> {


}
