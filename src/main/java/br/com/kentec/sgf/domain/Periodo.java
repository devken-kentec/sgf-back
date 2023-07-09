package br.com.kentec.sgf.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="periodo")
@SuppressWarnings("serial")
public class Periodo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="periodo", nullable = false, length = 32)
	private String perido;
	
	@Column(name="status_periodo", nullable = false, length = 10)
	private String statusPeriodo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerido() {
		return perido;
	}

	public void setPerido(String perido) {
		this.perido = perido;
	}

	public String getStatusPeriodo() {
		return statusPeriodo;
	}

	public void setStatusPeriodo(String statusPeriodo) {
		this.statusPeriodo = statusPeriodo;
	}

	@Override
	public String toString() {
		return "Periodo [id=" + id + ", perido=" + perido + ", statusPeriodo=" + statusPeriodo + "]";
	}
}
