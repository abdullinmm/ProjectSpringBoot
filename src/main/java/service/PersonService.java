package service;

import models.Person;
import java.util.Optional;

public interface PersonService {

    Iterable<Person> findAll ();
    Optional<Person> findById(Long id);
    Person save (Person person);
    void deleteById (Long id);
}
