package com.example.safi.dabase.qcomponents.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.safi.dabase.qcomponents.demo.entities.MenuSemanal;
import com.example.safi.dabase.qcomponents.demo.repository.MenuSemanalRepository;

@Service
public class MenuSemanalService {

    @Autowired
    private MenuSemanalRepository menuSemanalRepository;

    public List<MenuSemanal> findAll() {
        return menuSemanalRepository.findAll();
    }

    public Optional<MenuSemanal> findById(Long idMenu) {
        return menuSemanalRepository.findById(idMenu);
    }

    public MenuSemanal save(MenuSemanal menuSemanal) {
        return menuSemanalRepository.save(menuSemanal);
    }

    public void deleteById(Long idMenu) {
        menuSemanalRepository.deleteById(idMenu);
    }
}
