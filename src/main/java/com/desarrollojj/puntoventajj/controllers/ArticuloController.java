package com.desarrollojj.puntoventajj.controllers;

import com.desarrollojj.puntoventajj.models.Articulo;
import com.desarrollojj.puntoventajj.services.ArticuloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/articulo")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ArticuloController {

    private final ArticuloServices articuloServices;

    @Autowired
    public ArticuloController(ArticuloServices articuloServices) {
        this.articuloServices = articuloServices;
    }

    @GetMapping("/articulos")
    public ResponseEntity<List<Articulo>> obtenerArticulos() {
        return new ResponseEntity<>(articuloServices.listarArticulos(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Articulo> crearArticulo(@RequestBody Articulo articulo) {
        Articulo newArticulo = new Articulo(articulo.getNombre(), articulo.getDescripcion());
        return new ResponseEntity<>(articuloServices.insertarArticulo(newArticulo),HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Articulo> actualizarArticulo(@RequestBody Articulo articulo) {
        Optional<Articulo> articulOptional = articuloServices.buscarArticulo(articulo.getId());
        if(articulOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Articulo articuloModify = articulOptional.get();
        articuloModify.setNombre(articulo.getNombre());
        articuloModify.setDescripcion(articulo.getDescripcion());
        return new ResponseEntity<>(articuloServices.insertarArticulo(articuloModify),HttpStatus.OK);
    }

    public ResponseEntity<Void> eliminarArticulo(@RequestBody Articulo articulo) {
        Optional<Articulo> articulOptional = articuloServices.buscarArticulo(articulo.getId());
        if(articulOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Articulo articuloModify = articulOptional.get();
        articuloServices.eliminarArticulo(articuloModify);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}