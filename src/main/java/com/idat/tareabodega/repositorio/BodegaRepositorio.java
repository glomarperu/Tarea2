package com.idat.tareabodega.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.tareabodega.modelo.Bodega;
@Repository
public interface BodegaRepositorio extends JpaRepository<Bodega, Integer> {

}
