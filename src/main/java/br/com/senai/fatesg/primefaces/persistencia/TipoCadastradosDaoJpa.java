package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.TipoCadastrado;

@Repository("tipoCadastradosDao")
public class TipoCadastradosDaoJpa extends PersistenciaJpa<TipoCadastrado> implements TipoCadastradosDao{

   private static final long serialVersionUID = 1L;

}
