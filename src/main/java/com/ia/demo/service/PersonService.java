package com.ia.demo.service;

import com.ia.demo.domain.DateId;
import com.ia.demo.domain.Diagnostic;
import com.ia.demo.domain.Person;
import com.ia.demo.dto.PersonDTO;
import com.ia.demo.mapper.PersonMapper;
import com.ia.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    public PersonDTO findByDni(String dni){
        return personMapper.toDTO(personRepository.findByDni(dni));
    }

    public List<DateId> getDiagnosticDates(PersonDTO person){
        return personRepository.getOne(person.getId()).getDiagnosticList().stream().sorted(Comparator.nullsLast(
                (e1, e2) -> e2.getDate().compareTo(e1.getDate()))).map(d -> new DateId(d.getId(),d.getDate().toString())).collect(Collectors.toList());
    }

    public void save(PersonDTO person) {
        personRepository.saveAndFlush(personMapper.toModel(person));
    }
}