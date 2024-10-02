package com.example.safi.dabase.qcomponents.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String correoInstitucional;
    private String programaAcademico;
    @OneToOne
    private Persona persona;
    @OneToOne
    private Usuario usuarioCredenciales;
    private String facultad;
    private int semestre;
    private String escuela;

    // Getters and Setters
    public Long getIdEstudiante() {
        return idEstudiante;
    }
    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    public String getProgramaAcademico() {
        return programaAcademico;
    }
    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Usuario getUsuarioCredenciales() {
        return usuarioCredenciales;
    }
    public void setUsuarioCredenciales(Usuario usuarioCredenciales) {
        this.usuarioCredenciales = usuarioCredenciales;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
}
