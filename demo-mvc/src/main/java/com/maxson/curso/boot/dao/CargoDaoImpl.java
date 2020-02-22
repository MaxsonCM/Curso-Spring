package com.maxson.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.maxson.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao  {

}
