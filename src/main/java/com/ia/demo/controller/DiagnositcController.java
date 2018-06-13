package com.ia.demo.controller;

import com.ia.demo.dto.DiagnosticDTO;
import com.ia.demo.service.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="/diagnostic/")
public class DiagnositcController {
    @Autowired
    private DiagnosticService diagnosticService;

    @PostMapping(value="diagnostic")
    public DiagnosticDTO getDiagnostic(@RequestBody DiagnosticDTO diagnosticDTO){
        return diagnosticService.calculateDiagnostic(diagnosticDTO);
    }

    @GetMapping(value="{id}")
    public DiagnosticDTO DiagnosticService(@RequestParam Long id){
        return diagnosticService.getById(id);
    }

    @GetMapping(value="byPersonId/{id}")
    public List<DiagnosticDTO> getAllDiagnostic(Long id){
        return diagnosticService.getAllDiagnosticByPersonId(id);
    }
}
