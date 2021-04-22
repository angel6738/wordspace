package ec.edu.utm.backend.service;

import ec.edu.utm.backend.entity.Person;
import ec.edu.utm.backend.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService{

    @Autowired
    private IPersonRepository personRepository;

    @Override
    public Boolean savePerson(Person user) {
        try {
            personRepository.save(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
