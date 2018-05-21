package br.com.fiap.nac.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Cliente;
import br.com.fiap.nac.dao.ClienteDAO;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO {

	public ClienteDAOImpl(EntityManager em) {
		super(em);
	}

}
