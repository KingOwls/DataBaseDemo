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

import com.example.safi.dabase.qcomponents.demo.entities.FormularioPQRSF;
import com.example.safi.dabase.qcomponents.demo.service.FormularioPQRSFService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/formulariopqrsf")
public class FormularioPQRSFController {

    @Autowired
    private FormularioPQRSFService formularioPQRSFService;

    @GetMapping
    public List<FormularioPQRSF> getAll() {
        return formularioPQRSFService.findAll();
    }

    @GetMapping("/{idPQRSF}")
    public ResponseEntity<FormularioPQRSF> getById(@PathVariable Long idPQRSF) {
        Optional<FormularioPQRSF> formularioPQRSF = formularioPQRSFService.findById(idPQRSF);
        if (formularioPQRSF.isPresent()) {
            return ResponseEntity.ok(formularioPQRSF.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public FormularioPQRSF create(@RequestBody FormularioPQRSF formularioPQRSF) {
        return formularioPQRSFService.save(formularioPQRSF);
    }

    @PutMapping("/{idPQRSF}")
    public ResponseEntity<FormularioPQRSF> update(@PathVariable Long idPQRSF, @RequestBody FormularioPQRSF formularioPQRSFDetails) {
        Optional<FormularioPQRSF> formularioPQRSF = formularioPQRSFService.findById(idPQRSF);
        if (formularioPQRSF.isPresent()) {
            FormularioPQRSF updatedFormularioPQRSF = formularioPQRSF.get();
            updatedFormularioPQRSF.setNombreCompleto(formularioPQRSFDetails.getNombreCompleto());
            updatedFormularioPQRSF.setEstudiante(formularioPQRSFDetails.getEstudiante());
            updatedFormularioPQRSF.setCorreoInstitucional(formularioPQRSFDetails.getCorreoInstitucional());
            updatedFormularioPQRSF.setTipoSolicitud(formularioPQRSFDetails.getTipoSolicitud());
            updatedFormularioPQRSF.setDescripcionHecho(formularioPQRSFDetails.getDescripcionHecho());
            updatedFormularioPQRSF.setFechaEnvio(formularioPQRSFDetails.getFechaEnvio());
            updatedFormularioPQRSF.setEstado(formularioPQRSFDetails.getEstado());
            formularioPQRSFService.save(updatedFormularioPQRSF);
            return ResponseEntity.ok(updatedFormularioPQRSF);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idPQRSF}")
    public ResponseEntity<Void> delete(@PathVariable Long idPQRSF) {
        if (formularioPQRSFService.findById(idPQRSF).isPresent()) {
            formularioPQRSFService.deleteById(idPQRSF);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}