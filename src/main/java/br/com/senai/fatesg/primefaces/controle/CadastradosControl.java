package br.com.senai.fatesg.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;


import br.com.senai.fatesg.primefaces.entidade.CadastradosEntity;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.primefaces.persistencia.CadastradosDao;

@Named("CadastradosControl")
@RequestScoped
public class CadastradosControl {
	// entidades
	private CadastradosEntity cadastradosEntity = new CadastradosEntity();

	@Autowired
	private CadastradosDao cadastradosDao;

	// listas
	private List<CadastradosEntity> cadastrados = new ArrayList<CadastradosEntity>();

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
			cadastradosDao.incluir(cadastradosEntity);
			cadastradosEntity = new CadastradosEntity();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public CadastradosEntity getCadastradosEntity() {
		return cadastradosEntity;
	}

	public void setCadastradosEntity(CadastradosEntity cadastradosEntity) {
		this.cadastradosEntity = cadastradosEntity;
	}

	public List<CadastradosEntity> getCadastrados() {
		return cadastrados;
	}

	public void setCadastrados(List<CadastradosEntity> cadastrados) {
		this.cadastrados = cadastrados;
	}

}