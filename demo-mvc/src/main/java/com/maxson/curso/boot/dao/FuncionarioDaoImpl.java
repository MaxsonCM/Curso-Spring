package com.maxson.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

//import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.maxson.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends  AbstractDao<Funcionario, Long> implements FuncionarioDao  {

	@Override
	public List<Funcionario> findByNome(String nome) {
		/*
		TypedQuery<Funcionario> query = getEntityManager()
				.createQuery("select f from Funcionario f where f.nome like :nome", Funcionario.class);
		query.setParameter("nome", nome);
		return query.getResultList();
		*/
		return createQuery("select f from Funcionario f where f.nome like concat('%', ?1, '%')", nome);
	}

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
	}

	@Override
	public List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida) {
		String spql = new StringBuilder("select f from Funcionario f ")
				.append(" where f.dataEntrada >= ?1 ")
				.append(" and f.dataSaida <= ?2 ")
				.append(" order by f.dataEntrada asc").toString();
		return createQuery(spql, entrada, saida);
	}

	@Override
	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		String spql = new StringBuilder("select f from Funcionario f ")
				.append(" where f.dataEntrada = ?1 ")
				.append(" order by f.dataEntrada asc").toString();
		return createQuery(spql, entrada);
	}

	@Override
	public List<Funcionario> findByDataSaida(LocalDate saida) {
		String spql = new StringBuilder("select f from Funcionario f ")
				.append(" where f.dataSaida = ?1 ")
				.append(" order by f.dataEntrada asc").toString();
		return createQuery(spql, saida);
	}

}
