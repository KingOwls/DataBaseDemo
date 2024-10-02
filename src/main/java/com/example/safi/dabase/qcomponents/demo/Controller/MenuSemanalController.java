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

import com.example.safi.dabase.qcomponents.demo.entities.MenuSemanal;

import com.example.safi.dabase.qcomponents.demo.service.MenuSemanalService;

@RestController
@RequestMapping("/api/menus")
public class MenuSemanalController {

    @ Autowired
    private MenuSemanalService menuSemanalService;

    @GetMapping
    public List<MenuSemanal> findAll() {
        return menuSemanalService.findAll();
    }

    @GetMapping("/{idMenu}")
    public ResponseEntity<MenuSemanal> findById(@PathVariable Long idMenu) {
        Optional<MenuSemanal> menuSemanal = menuSemanalService.findById(idMenu);
        if (menuSemanal.isPresent()) {
            return ResponseEntity.ok(menuSemanal.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<MenuSemanal> save(@RequestBody MenuSemanal menuSemanal) {
        MenuSemanal savedMenuSemanal = menuSemanalService.save(menuSemanal);
        return ResponseEntity.ok(savedMenuSemanal);
    }

    @PutMapping("/{idMenu}")
    public ResponseEntity<MenuSemanal> update(@PathVariable Long idMenu, @RequestBody MenuSemanal menuSemanal) {
        Optional<MenuSemanal> existingMenuSemanal = menuSemanalService.findById(idMenu);
        if (existingMenuSemanal.isPresent()) {
            menuSemanal.setIdMenu(idMenu);
            MenuSemanal updatedMenuSemanal = menuSemanalService.save(menuSemanal);
            return ResponseEntity.ok(updatedMenuSemanal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idMenu}")
    public ResponseEntity<Void> delete(@PathVariable Long idMenu) {
        menuSemanalService.deleteById(idMenu);
        return ResponseEntity.ok().build();
    }
}
