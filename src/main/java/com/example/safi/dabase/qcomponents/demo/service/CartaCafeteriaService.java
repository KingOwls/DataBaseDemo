package com.example.safi.dabase.qcomponents.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.safi.dabase.qcomponents.demo.entities.CartaCafeteria;
import com.example.safi.dabase.qcomponents.demo.repository.CartaCafeteriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CartaCafeteriaService {

    @Autowired
    private CartaCafeteriaRepository cartaCafeteriaRepository;

    public List<CartaCafeteria> findAll() {
        return cartaCafeteriaRepository.findAll();
    }

    public Optional<CartaCafeteria> findById(Long id) {
        return cartaCafeteriaRepository.findById(id);
    }

    public CartaCafeteria save(CartaCafeteria cartaCafeteria) {
        return cartaCafeteriaRepository.save(cartaCafeteria);
    }

    public void deleteById(Long id) {
        cartaCafeteriaRepository.deleteById(id);
    }
}
