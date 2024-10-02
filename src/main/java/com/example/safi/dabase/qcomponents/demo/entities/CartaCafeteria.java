package com.example.safi.dabase.qcomponents.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CartaCafeteria")
public class CartaCafeteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarta;
    private String imagen;
    private String descripcion;
    // getters and setters
    public Long getIdCarta() {
        return idCarta;
    }
    public void setIdCarta(Long idCarta) {
        this.idCarta = idCarta;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
