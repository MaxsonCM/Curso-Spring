package com.maxson.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.maxson.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends  AbstractDao<Funcionario, Long> implements FuncionarioDao  {

}
