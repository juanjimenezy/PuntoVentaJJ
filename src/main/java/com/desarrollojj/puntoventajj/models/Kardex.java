package com.desarrollojj.puntoventajj.models;

import com.desarrollojj.puntoventajj.enums.KardexOperacionEnum;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "kardex")
public class Kardex implements Serializable {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @Enumerated(EnumType.STRING)
    private KardexOperacionEnum operacion;

    private BigDecimal precio;

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

    private static final long serialVersionUID = 1L;
}
