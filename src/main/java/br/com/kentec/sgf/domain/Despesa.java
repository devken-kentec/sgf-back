package br.com.kentec.sgf.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="despesa")
@SuppressWarnings("serial")
public class Despesa implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="descricao", nullable = false, length = 128)
	private String descricao;
	
	@Column(name="status_despesa", nullable = false, length = 1)
	private String statusDespesa;
	
	@Column(name="certificador", nullable = false, length = 36)
	private String certificador;
	
	
	public Despesa() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatusDespesa() {
		return statusDespesa;
	}

	public void setStatusDespesa(String statusDespesa) {
		this.statusDespesa = statusDespesa;
	}

	public String getCertificador() {
		return certificador;
	}

	public void setCertificador(String certificador) {
		this.certificador = certificador;
	}

	@Override
	public String toString() {
		return "Despesa [id=" + id + ", descricao=" + descricao + ", statusDespesa=" + statusDespesa + ", certificador="
				+ certificador + "]";
	}
}
