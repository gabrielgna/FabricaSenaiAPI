package br.com.senai.fatesg.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.ws.rs.ApplicationPath;


import org.springframework.beans.factory.annotation.Autowired;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.primefaces.entidade.Cadastrados;
import br.com.senai.fatesg.primefaces.entidade.TipoCadastrado;
import br.com.senai.fatesg.primefaces.persistencia.CadastradosDao;
import br.com.senai.fatesg.primefaces.persistencia.TipoCadastradosDao;

@ApplicationPath("REST")
@Named("CadastradosControl")
@RequestScoped
public class CadastradosControl {
	// entidades
	private Cadastrados cadastrado = new Cadastrados();

	@Autowired
	private CadastradosDao cadastradosDao;

	// listas
	private List<Cadastrados> cadastrados = new ArrayList<Cadastrados>();

	@PostConstruct
	public void init() {
		listar(null);
	}


	public void listar(ActionEvent evt) {
		try {
			cadastrados = cadastradosDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}

	}

	public void confirmar() {
		try {
			cadastradosDao.incluir(cadastrado);
			cadastrado = new Cadastrados();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public Cadastrados getCadastrado() {
		return cadastrado;
	}

	public void setCadastrado(Cadastrados cadastrado) {
		this.cadastrado = cadastrado;
	}

	public List<Cadastrados> getCadastrados() {
		return cadastrados;
	}

	public void setCadastrados(List<Cadastrados> cadastrados) {
		this.cadastrados = cadastrados;
	}

}