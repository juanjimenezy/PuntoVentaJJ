package com.desarrollojj.puntoventajj;

import com.desarrollojj.puntoventajj.services.ArticuloServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PuntoVentaJjApplicationTests {

    @Autowired
    private ArticuloServices articuloServices;

    @Test
    void contextLoads() {
        assert articuloServices != null;
    }

}
