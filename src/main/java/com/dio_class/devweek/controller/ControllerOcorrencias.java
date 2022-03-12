package com.dio_class.devweek.controller;

import com.dio_class.devweek.entity.IncidenciaExame;
import com.dio_class.devweek.repository.OcorrenciaRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController

public class ControllerOcorrencias {
    private final OcorrenciaRepo ocRepository;

    public ControllerOcorrencias(OcorrenciaRepo ocRepository) {
        this.ocRepository = ocRepository;
    }

    @GetMapping("/api/ocorrencias")
    public ResponseEntity<List<IncidenciaExame>> findOcorrencias(){
        List<IncidenciaExame> listaOcorrencia = ocRepository.findAll();
        if (listaOcorrencia.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return new ResponseEntity<>(listaOcorrencia, HttpStatus.OK);
    }

    @GetMapping("/api/ocorrencia/{id}")
    public ResponseEntity<IncidenciaExame> findOcorrenciasById(@PathVariable Long id){
        Optional<IncidenciaExame> ocorrenciaOptional = ocRepository.findById(id);
        if (ocorrenciaOptional.isPresent()){
            IncidenciaExame ocorrenciaUnid = ocorrenciaOptional.get();
            return new ResponseEntity<>(ocorrenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
