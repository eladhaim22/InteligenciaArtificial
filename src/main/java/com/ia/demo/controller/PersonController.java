package com.ia.demo.controller;

import com.ia.demo.domain.Diagnostic;
import com.ia.demo.dto.DiagnosticDTO;
import com.ia.demo.dto.PersonDTO;
import com.ia.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/person/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value="{dni}")
    public PersonDTO getPersonByDni(@RequestParam  String dni){
        return personService.findByDni(dni);
    }

    @PostMapping(value="")
    public void savePerson(@RequestParam PersonDTO person){
        personService.save(person);
    }
}
