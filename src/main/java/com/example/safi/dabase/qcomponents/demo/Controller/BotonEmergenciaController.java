package com.example.safi.dabase.qcomponents.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.safi.dabase.qcomponents.demo.entities.BotonEmergencia;
import com.example.safi.dabase.qcomponents.demo.service.BotonEmergenciaService;

@RestController
@RequestMapping("/api/botonemergencia")
public class BotonEmergenciaController {

    @Autowired
    private BotonEmergenciaService botonEmergenciaService;

    @GetMapping
    public List<BotonEmergencia> getAll() {
        return botonEmergenciaService.findAll();
    }

    /**
     * @param idEmergencia
     * @return
     */
    @GetMapping("/{idEmergencia}")
    public ResponseEntity<BotonEmergencia> getById(@PathVariable Long idEmergencia) {
        Optional<BotonEmergencia> botonEmergencia = botonEmergenciaService.findById(idEmergencia);
        if (botonEmergencia.isPresent()) {
            return ResponseEntity.ok(botonEmergencia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public BotonEmergencia create(@RequestBody BotonEmergencia botonEmergencia) {
        return botonEmergenciaService.save(botonEmergencia);
    }

    /**
     * @param idEmergencia
     * @param botonEmergenciaDetails
     * @return
     */
    @PutMapping("/{idEmergencia}")
    public ResponseEntity<BotonEmergencia> update(@PathVariable Long idEmergencia, @RequestBody BotonEmergencia botonEmergenciaDetails) {
        Optional<BotonEmergencia> botonEmergencia = botonEmergenciaService.findById(idEmergencia);
        if (botonEmergencia.isPresent()) {
            BotonEmergencia updatedBotonEmergencia = botonEmergencia.get();
            updatedBotonEmergencia.setNombreEstudiante(botonEmergenciaDetails.getNombreEstudiante());
            updatedBotonEmergencia.setEstudiante(botonEmergenciaDetails.getEstudiante());
            updatedBotonEmergencia.setProgramaAcademico(botonEmergenciaDetails.getProgramaAcademico());
            updatedBotonEmergencia.setDescripcion(botonEmergenciaDetails.getDescripcion());
            updatedBotonEmergencia.setFechaHora(botonEmergenciaDetails.getFechaHora());
            updatedBotonEmergencia.setEstado(botonEmergenciaDetails.getEstado());
            updatedBotonEmergencia.setCanalesNotificacion(botonEmergenciaDetails.getCanalesNotificacion());
            botonEmergenciaService.save(updatedBotonEmergencia);
            return ResponseEntity.ok(updatedBotonEmergencia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idEmergencia}")
    public ResponseEntity<Void> delete(@PathVariable Long idEmergencia) {
        if (botonEmergenciaService.findById(idEmergencia).isPresent()) {
            botonEmergenciaService.deleteById(idEmergencia);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
