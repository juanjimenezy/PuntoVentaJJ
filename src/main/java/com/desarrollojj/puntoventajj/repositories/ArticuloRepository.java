package com.desarrollojj.puntoventajj.repositories;

import com.desarrollojj.puntoventajj.models.Articulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {
}
