package ec.edu.utm.backend.repository;

import ec.edu.utm.backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonRepository extends JpaRepository<Person, String> {
    List<Person> findByFirstName(String firstName);
}
