package com.desarrollojj.puntoventajj.services;

import com.desarrollojj.puntoventajj.models.Articulo;
import com.desarrollojj.puntoventajj.repositories.ArticuloRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class ArticuloServicesTests {

    @Mock
    private ArticuloRepository articuloRepository;

    @InjectMocks
    private ArticuloServices articuloServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testInsertarArticulo() {
        Articulo articulo = new Articulo();
        articulo.setId(1L);
        articulo.setNombre("Articulo 1");
        when(articuloRepository.save(any(Articulo.class))).thenReturn(articulo);
        Articulo resultado = articuloServices.insertarArticulo(articulo);
        assertNotNull(resultado);
        assertEquals(1L, resultado.getId());
        assertEquals("Articulo 1", resultado.getNombre());
    }
}
