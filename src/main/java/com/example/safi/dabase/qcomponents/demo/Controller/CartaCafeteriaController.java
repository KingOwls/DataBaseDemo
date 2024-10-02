package com.example.safi.dabase.qcomponents.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.safi.dabase.qcomponents.demo.entities.CartaCafeteria;
import com.example.safi.dabase.qcomponents.demo.service.CartaCafeteriaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cartacafeteria")
public class CartaCafeteriaController {

    @Autowired
    private CartaCafeteriaService cartaCafeteriaService;

    @GetMapping
    public List<CartaCafeteria> getAll() {
        return cartaCafeteriaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartaCafeteria> getById(@PathVariable Long id) {
        Optional<CartaCafeteria> cartaCafeteria = cartaCafeteriaService.findById(id);
        if (cartaCafeteria.isPresent()) {
            return ResponseEntity.ok(cartaCafeteria.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public CartaCafeteria create(@RequestBody CartaCafeteria cartaCafeteria) {
        return cartaCafeteriaService.save(cartaCafeteria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartaCafeteria> update(@PathVariable Long id, @RequestBody CartaCafeteria cartaDetails) {
        Optional<CartaCafeteria> cartaCafeteria = cartaCafeteriaService.findById(id);
        if (cartaCafeteria.isPresent()) {
            CartaCafeteria updatedCarta = cartaCafeteria.get();
            updatedCarta.setImagen(cartaDetails.getImagen());
            updatedCarta.setDescripcion(cartaDetails.getDescripcion());
            cartaCafeteriaService.save(updatedCarta);
            return ResponseEntity.ok(updatedCarta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (cartaCafeteriaService.findById(id).isPresent()) {
            cartaCafeteriaService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

