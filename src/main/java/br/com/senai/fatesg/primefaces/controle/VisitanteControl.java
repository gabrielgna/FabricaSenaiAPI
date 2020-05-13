package br.com.senai.fatesg.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.senai.fatesg.primefaces.persistencia.VisitanteDaoJpa;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.primefaces.entidade.Visitante;
import br.com.senai.fatesg.primefaces.persistencia.VisitanteDao;


@Path("/liberacoes")
public class VisitanteControl {

	@Autowired
	private VisitanteDao visitanteDao;
	private List<Visitante> visitantes = new ArrayList<Visitante>();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMensagem() {
		return "Teste";
	}


}
