package br.com.fiap.nac.dao;

import java.util.List;

import br.com.fiap.entity.Apartamento;

public interface ApartamentoDAO extends GenericDAO<Apartamento, Integer>{

	List<Apartamento> buscarPorEndereco(String end);
}
