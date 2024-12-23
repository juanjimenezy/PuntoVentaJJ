package com.desarrollojj.puntoventajj.controllers;

import com.desarrollojj.puntoventajj.models.Articulo;
import com.desarrollojj.puntoventajj.models.Kardex;
import com.desarrollojj.puntoventajj.services.ArticuloServices;
import com.desarrollojj.puntoventajj.services.KardexServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/kardex")
@CrossOrigin(value = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class KardexController {

    private final KardexServices kardexServices;

    private final ArticuloServices articuloServices;

    @Autowired
    public KardexController(KardexServices kardexServices, ArticuloServices articuloServices) {
        this.kardexServices = kardexServices;
        this.articuloServices = articuloServices;
    }

    @GetMapping()
    public ResponseEntity<List<Kardex>> obtenerRegistros() {
        List<Kardex> lKardex = kardexServices.getKardex();
        return new ResponseEntity<>(lKardex, HttpStatus.OK);
    }

    @PostMapping("/operacion")
    public ResponseEntity<Kardex> crearKardex(@RequestBody Kardex kardex) {
        Articulo articulo = articuloServices.buscarArticulo(kardex.getArticulo().getId()).orElse(null);
        kardex.setArticulo(articulo);
        kardex = kardexServices.ingresarOperacion(kardex);
        return new ResponseEntity<>(kardex, HttpStatus.CREATED);
    }
}