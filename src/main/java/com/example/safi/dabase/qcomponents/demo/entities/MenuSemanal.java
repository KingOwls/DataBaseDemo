package com.example.safi.dabase.qcomponents.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MenuSemanal")
public class MenuSemanal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String imagen;
    private String descripcion;
    // getters and setters
    public Long getIdMenu() {
        return idMenu;
    }
    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
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
