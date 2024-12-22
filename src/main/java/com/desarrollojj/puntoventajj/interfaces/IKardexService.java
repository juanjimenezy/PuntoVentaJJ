package com.desarrollojj.puntoventajj.interfaces;

import com.desarrollojj.puntoventajj.models.Kardex;

import java.util.List;

public interface IKardexService {

    public List<Kardex> getKardex();

    public Kardex ingresarOperacion(Kardex kardex);

}
