package com.desarrollojj.puntoventajj.services;

import com.desarrollojj.puntoventajj.interfaces.IKardexService;
import com.desarrollojj.puntoventajj.models.Kardex;
import com.desarrollojj.puntoventajj.repositories.KardexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KardexServices implements IKardexService {

    private final KardexRepository kardexRepository;

    @Autowired
    public KardexServices(KardexRepository kardexRepository) {
        this.kardexRepository = kardexRepository;
    }

    @Override
    public Kardex ingresarOperacion(Kardex kardex) {
        return kardexRepository.save(kardex);
    }

}
