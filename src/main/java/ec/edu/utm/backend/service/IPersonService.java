package ec.edu.utm.backend.service;

import ec.edu.utm.backend.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {
    Boolean savePerson(Person user);
    List<Person> findAll();
}
