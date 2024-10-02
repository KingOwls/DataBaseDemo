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

import com.example.safi.dabase.qcomponents.demo.entities.Noticia;
import com.example.safi.dabase.qcomponents.demo.service.NoticiaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public List<Noticia> findAll() {
        return noticiaService.findAll();
    }

    @GetMapping("/{idNoticia}")
    public ResponseEntity<Noticia> findById(@PathVariable Long idNoticia) {
        Optional<Noticia> noticia = noticiaService.findById(idNoticia);
        if (noticia.isPresent()) {
            return ResponseEntity.ok(noticia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Noticia> save(@RequestBody Noticia noticia) {
        Noticia savedNoticia = noticiaService.save(noticia);
        return ResponseEntity.ok(savedNoticia);
    }

    @PutMapping("/{idNoticia}")
    public ResponseEntity<Noticia> update(@PathVariable Long idNoticia, @RequestBody Noticia noticia) {
        Optional<Noticia> existingNoticia = noticiaService.findById(idNoticia);
        if (existingNoticia.isPresent()) {
            noticia.setIdNoticia(idNoticia);
            Noticia updatedNoticia = noticiaService.save(noticia);
            return ResponseEntity.ok(updatedNoticia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idNoticia}")
    public ResponseEntity<Void> delete(@PathVariable Long idNoticia) {
        noticiaService.deleteById(idNoticia);
        return ResponseEntity.ok().build();
    }
}