package com.example.safi.dabase.qcomponents.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.safi.dabase.qcomponents.demo.entities.Noticia;
import com.example.safi.dabase.qcomponents.demo.repository.NoticiaRepository;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    public List<Noticia> findAll() {
        return noticiaRepository.findAll();
    }

    public Optional<Noticia> findById(Long idNoticia) {
        return noticiaRepository.findById(idNoticia);
    }

    public Noticia save(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }

    public void deleteById(Long idNoticia) {
        noticiaRepository.deleteById(idNoticia);
    }
}