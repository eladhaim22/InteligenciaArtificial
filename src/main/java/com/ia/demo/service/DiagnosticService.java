package com.ia.demo.service;

import com.ia.demo.domain.Diagnostic;
import com.ia.demo.repository.DiagnosticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class DiagnosticService {
    @Autowired
    private DiagnosticRepository diagnosticRepository;

    public Diagnostic getLastDiagnosticByPersonId(Long personId){
        List<Diagnostic> diagnosticList = diagnosticRepository.findAllByPerson_Id(personId);
        return diagnosticList.stream().sorted(Comparator.nullsLast(
                (e1, e2) -> e2.getDate().compareTo(e1.getDate())))
                .findFirst().get();
    }

    public String calculateDiagnostic(){
        return "Enfermedad";
    }
}
