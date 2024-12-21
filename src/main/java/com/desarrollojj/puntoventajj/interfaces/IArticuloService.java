package com.desarrollojj.puntoventajj.interfaces;

import com.desarrollojj.puntoventajj.models.Articulo;

import java.util.List;
import java.util.Optional;

public interface IArticuloService {

    public Articulo insertarArticulo(Articulo articulo);

    public void eliminarArticulo(Articulo articulo);

    public Articulo modificarArticulo(Articulo articulo);

    public List<Articulo> listarArticulos();

    public Articulo buscarArticulo(Articulo articulo);

    public Optional<Articulo> buscarArticulo(Long id);

}
