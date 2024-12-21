package com.desarrollojj.puntoventajj.controllers;

import com.desarrollojj.puntoventajj.models.Articulo;
import com.desarrollojj.puntoventajj.services.ArticuloServices;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/articulo")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ArticuloController {

    @Autowired
    private ArticuloServices articuloServices;

    @GetMapping("/articulos")
    public ResponseEntity<List<Articulo>> getAll() {
        return new ResponseEntity<List<Articulo>>(articuloServices.listarArticulos(), HttpStatus.OK);
    }

}
