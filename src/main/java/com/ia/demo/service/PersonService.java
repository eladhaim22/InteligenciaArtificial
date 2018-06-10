package com.ia.demo.service;

import com.ia.demo.domain.Person;
import com.ia.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person findByDni(String dni){
        return personRepository.findByDni(dni);
    }
}
