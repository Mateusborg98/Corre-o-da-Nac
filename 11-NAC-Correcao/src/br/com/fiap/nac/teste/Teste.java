package br.com.fiap.nac.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.entity.Apartamento;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Locacao;
import br.com.fiap.entity.Sexo;
import br.com.fiap.nac.dao.LocacaoDAO;
import br.com.fiap.nac.dao.impl.LocacaoDAOImpl;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {

		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager em = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("José");
		cliente.setSexo(Sexo.MASCULINO);
		cliente.setDataNascimento(Calendar.getInstance());
		
		Apartamento ap = new Apartamento();
		ap.setDetalhes("Teste");
		ap.setEndereco("Rua teste");
		
		Locacao loc = new Locacao();
		loc.setDataInicio(Calendar.getInstance());
		loc.setDataFim(Calendar.getInstance());
		loc.setApartamento(ap);
		loc.setCliente(cliente);
		
		LocacaoDAO dao = new LocacaoDAOImpl(em);
		dao.cadastrar(loc);
		try {
			dao.salvar();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		em.clear();
		factory.close();
	}

}
