package com.example.safi.dabase.qcomponents.demo.entities;

import com.example.safi.dabase.qcomponents.demo.enumes.Estado;
import com.example.safi.dabase.qcomponents.demo.enumes.CanalNotificacion;
import java.sql.Timestamp;

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
@Table(name = "BotonEmergencia")
public class BotonEmergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmergencia;
    private String nombreEstudiante;
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
    private String programaAcademico;
    private String descripcion;
    @Column(nullable = false)
    private Timestamp fechaHora;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Enumerated(EnumType.STRING)
    private CanalNotificacion canalesNotificacion;
    // getters and setters
    public Long getIdEmergencia() {
        return idEmergencia;
    }
    public void setIdEmergencia(Long idEmergencia) {
        this.idEmergencia = idEmergencia;
    }
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public String getProgramaAcademico() {
        return programaAcademico;
    }
    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Timestamp getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public CanalNotificacion getCanalesNotificacion() {
        return canalesNotificacion;
    }
    public void setCanalesNotificacion(CanalNotificacion canalesNotificacion) {
        this.canalesNotificacion = canalesNotificacion;
    }


}