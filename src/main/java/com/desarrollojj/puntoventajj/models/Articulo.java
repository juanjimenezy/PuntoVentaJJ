package com.desarrollojj.puntoventajj.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

    @Id
    private Long id;

    private String nombre;

    private String descripcion;

    public Articulo() {}
    public Articulo(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Articulo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private static final long serialVersionUID = 1L;
}
