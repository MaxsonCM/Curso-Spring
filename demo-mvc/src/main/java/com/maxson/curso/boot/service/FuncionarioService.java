package com.maxson.curso.boot.service;

import java.util.List;

import com.maxson.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario busrcarPorId(Long id);
	
	List<Funcionario> buscarTodos();
}
