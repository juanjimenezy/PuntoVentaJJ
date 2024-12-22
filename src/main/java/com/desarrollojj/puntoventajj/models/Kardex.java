package com.desarrollojj.puntoventajj.models;

import com.desarrollojj.puntoventajj.enums.KardexOperacionEnum;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "kardex")
public class Kardex implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence_kardex")
    @SequenceGenerator(name = "id_sequence_kardex", sequenceName = "sq_id_kardex", allocationSize = 1, initialValue = 100)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @Enumerated(EnumType.STRING)
    private KardexOperacionEnum operacion;

    private BigDecimal precio;

    private int cantidad;

    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public KardexOperacionEnum getOperacion() {
        return operacion;
    }

    public void setOperacion(KardexOperacionEnum operacion) {
        this.operacion = operacion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Serial
    private static final long serialVersionUID = 1L;
}
