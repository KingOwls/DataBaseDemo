package com.example.safi.dabase.qcomponents.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Noticia")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNoticia;
    private String titulo;
    private String contenido;
    private String imagen;
    private String etiqueta;
    @Column(nullable = false)
    private Date fechaPublicacion;
    // getters and setters
    public Long getIdNoticia() {
        return idNoticia;
    }
    public void setIdNoticia(Long idNoticia) {
        this.idNoticia = idNoticia;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getEtiqueta() {
        return etiqueta;
    }
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
