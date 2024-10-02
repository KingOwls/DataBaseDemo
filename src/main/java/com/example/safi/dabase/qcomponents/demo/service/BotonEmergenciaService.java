package com.example.safi.dabase.qcomponents.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.safi.dabase.qcomponents.demo.entities.BotonEmergencia;
import com.example.safi.dabase.qcomponents.demo.repository.BotonEmergenciaRepository;

@Service
public class BotonEmergenciaService {

    @Autowired
    private BotonEmergenciaRepository botonEmergenciaRepository;

    public List<BotonEmergencia> findAll() {
        return botonEmergenciaRepository.findAll();
    }

    public Optional<BotonEmergencia> findById(Long idEmergencia) {
        return botonEmergenciaRepository.findById(idEmergencia);
    }

    public BotonEmergencia save(BotonEmergencia botonEmergencia) {
        return botonEmergenciaRepository.save(botonEmergencia);
    }

    public void deleteById(Long idEmergencia) {
        botonEmergenciaRepository.deleteById(idEmergencia);
    }
}
