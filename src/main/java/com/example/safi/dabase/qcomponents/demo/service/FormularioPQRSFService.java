package com.example.safi.dabase.qcomponents.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.safi.dabase.qcomponents.demo.entities.FormularioPQRSF;
import com.example.safi.dabase.qcomponents.demo.repository.FormularioPQRSFRepository;

@Service
public class FormularioPQRSFService {

    @Autowired
    private FormularioPQRSFRepository formularioPQRSFRepository;

    public List<FormularioPQRSF> findAll() {
        return formularioPQRSFRepository.findAll();
    }

    public Optional<FormularioPQRSF> findById(Long idPQRSF) {
        return formularioPQRSFRepository.findById(idPQRSF);
    }

    public FormularioPQRSF save(FormularioPQRSF formularioPQRSF) {
        return formularioPQRSFRepository.save(formularioPQRSF);
    }

    public void deleteById(Long idPQRSF) {
        formularioPQRSFRepository.deleteById(idPQRSF);
    }
}
