package br.com.senai.fatesg.primefaces.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Visitante {

	public Visitante(){};

	public Visitante(String nome, String RG){
		this.nome=nome;
		this.RG=RG;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "visistantes_seq", sequenceName = "visistantes_seq", allocationSize = 1, initialValue = 1)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cadastrados_id")
	private CadastradosEntity cadastradosEntity;
	
	
	private String nome;
	private String RG;
	
	@Temporal(TemporalType.TIME)
	private Date createDataTime;
	
	@Temporal(TemporalType.DATE)
	private Date latestEditDataTime;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CadastradosEntity getCadastradosEntity() {
		return cadastradosEntity;
	}
	public void setCadastradosEntity(CadastradosEntity cadastradosEntity) {
		this.cadastradosEntity = cadastradosEntity;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public Date getCreateDataTime() {
		return createDataTime;
	}
	public void setCreateDataTime(Date createDataTime) {
		this.createDataTime = createDataTime;
	}
	public Date getLatestEditDataTime() {
		return latestEditDataTime;
	}
	public void setLatestEditDataTime(Date latestEditDataTime) {
		this.latestEditDataTime = latestEditDataTime;
	}
	
	
}
