package com.desarrollojj.puntoventajj.repositories;

import com.desarrollojj.puntoventajj.models.Kardex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KardexRepository extends JpaRepository<Kardex, Long> {
}
