package com.desarrollojj.puntoventajj.services;

import com.desarrollojj.puntoventajj.interfaces.IArticuloService;
import com.desarrollojj.puntoventajj.models.Articulo;
import com.desarrollojj.puntoventajj.repositories.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloServices implements IArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public Articulo insertarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public void eliminarArticulo(Articulo articulo) {
        articuloRepository.save(articulo);
    }

    @Override
    public Articulo modificarArticulo(Articulo articulo) {
        Articulo articuloModify = articuloRepository.findById(articulo.getId()).orElse(null);
        articuloModify.setNombre(articulo.getNombre());
        articulo.setDescripcion(articulo.getDescripcion());
        return articuloRepository.save(articuloModify);
    }

    @Override
    public List<Articulo> listarArticulos() {
        return (List<Articulo>) articuloRepository.findAll();
    }

    @Override
    public Articulo buscarArticulo(Articulo articulo) {
        Long id = articulo.getId();
        return articuloRepository.findById(id).orElse(null);
    }

    @Override
    public Optional<Articulo> buscarArticulo(Long id) {
        return articuloRepository.findById(id);
    }
}
