package com.example.safi.dabase.qcomponents.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.safi.dabase.qcomponents.demo.entities.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}
