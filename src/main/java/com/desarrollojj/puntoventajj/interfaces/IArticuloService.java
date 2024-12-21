package com.desarrollojj.puntoventajj.interfaces;

import com.desarrollojj.puntoventajj.models.Articulo;

import java.util.List;

public interface IArticuloService {

    public void insertarArticulo(Articulo articulo);

    public void eliminarArticulo(Articulo articulo);

    public void modificarArticulo(Articulo articulo);

    public List<Articulo> listarArticulos();

    public Articulo buscarArticulo(Articulo articulo);

    public Articulo buscarArticulo(Long id);

}
