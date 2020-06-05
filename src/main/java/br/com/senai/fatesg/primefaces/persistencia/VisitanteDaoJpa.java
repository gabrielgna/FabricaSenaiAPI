package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.Visitante;

@Repository("visitanteDao")
public class VisitanteDaoJpa extends PersistenciaJpa<Visitante> implements VisitanteDao {

	private static final long serialVersionUID = 1L;
}
