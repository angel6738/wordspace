package ec.edu.utm.backend.controller;

import ec.edu.utm.backend.entity.Person;
import ec.edu.utm.backend.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping(value="/savePerson",method= RequestMethod.POST)
    public Boolean savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @RequestMapping(value="/findAll",method= RequestMethod.GET)
    public List<Person> findAll(){
        return personService.findAll();
    }
}
