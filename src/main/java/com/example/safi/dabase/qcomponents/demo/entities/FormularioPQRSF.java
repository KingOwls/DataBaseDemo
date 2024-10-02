package com.example.safi.dabase.qcomponents.demo.entities;

import java.security.Timestamp;

import com.example.safi.dabase.qcomponents.demo.enumes.Estado;
import com.example.safi.dabase.qcomponents.demo.enumes.TipoSolicitud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "FormularioPQRSF")
public class FormularioPQRSF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPQRSF;
    private String nombreCompleto;
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
    private String correoInstitucional;
    @Enumerated(EnumType.STRING)
    private TipoSolicitud tipoSolicitud;
    private String descripcionHecho;
    @Column(nullable = false)
    private Timestamp fechaEnvio;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    // getters and setters
    public Long getIdPQRSF() {
        return idPQRSF;
    }
    public void setIdPQRSF(Long idPQRSF) {
        this.idPQRSF = idPQRSF;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    public TipoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }
    public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }
    public String getDescripcionHecho() {
        return descripcionHecho;
    }
    public void setDescripcionHecho(String descripcionHecho) {
        this.descripcionHecho = descripcionHecho;
    }
    public Timestamp getFechaEnvio() {
        return fechaEnvio;
    }
    public void setFechaEnvio(Timestamp fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

