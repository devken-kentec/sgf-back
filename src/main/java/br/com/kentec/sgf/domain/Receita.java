package br.com.kentec.sgf.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="receita")
@SuppressWarnings("serial") 
public class Receita implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="descricao", nullable = false, length = 128)
	private String descricao;
	
	@Column(name="status_receita", nullable = false, length = 1)
	private String statusReceita;
	
	@Column(name="certificador", nullable = false, length = 36)
	private String certificador;
	
	
	public Receita() {
		
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

	public String getStatusReceita() {
		return statusReceita;
	}

	public void setStatusReceita(String statusReceita) {
		this.statusReceita = statusReceita;
	}

	public String getCertificador() {
		return certificador;
	}

	public void setCertificador(String certificador) {
		this.certificador = certificador;
	}

	@Override
	public String toString() {
		return "Receita [id=" + id + ", descricao=" + descricao + ", statusReceita=" + statusReceita + ", certificador="
				+ certificador + "]";
	}
}