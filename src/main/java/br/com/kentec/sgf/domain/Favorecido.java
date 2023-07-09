package br.com.kentec.sgf.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="favorecido")
@SuppressWarnings("serial")
public class Favorecido implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="cpf_cnpj", nullable = false, length = 14)
	private String cpfCnpj;
	
	@Column(name="nome", nullable = true, length = 50)
	private String nome;
	
	@Column(name="nome_fantasia", nullable = true, length = 50)
	private String nomeFantasia;
	
	@Column(name="razao_social", nullable = true, length = 50)
	private String razaoSocial;
	
	@Column(name="data_nascimento", nullable = true, length = 10)
	private LocalDate dataDeNascimento;
	
	@Column(name="data_constituicao", nullable = true, length = 10)
	private LocalDate dataDeConstituicao;
	
	@Column(name="sexo", nullable = true, length = 15)
	private String sexo;
	
	@Column(name="estadoCivil", nullable = true, length = 15)
	private String estadoCivil;
	
	@Column(name="inscricao_estadual", nullable = true, length = 9)
	private String inscricaoEstadual;
	
	@Column(name="inscricao_municipal", nullable = true, length = 9)
	private String inscricaoMunicipal;
	
	@Column(name="codigo_ibge", nullable = true, length = 7)
	private String codigoIbge;
	
	@Column(name="regime_tributario", nullable = true, length = 15)
	private String regimeTributario;
	
	@Column(name="cep", nullable = true, length = 8)
	private Long cep;
	
	@Column(name="endereco", nullable = true, length = 120)
	private String endereco;
	
	@Column(name="numero", nullable = true, length = 5)
	private String numero;
	
	@Column(name="complemento", nullable = true, length = 100)
	private String complemento;
	
	@Column(name="bairro", nullable = true, length = 16)
	private String bairro;
	
	@Column(name="cidade", nullable = true, length = 16)
	private String cidade;
	
	@Column(name="estado", nullable = true, length = 3)
	private String estado;
	
	@Column(name="telefone", nullable = true, length = 20)
	private String telefone;
	
	@Column(name="telefone_2", nullable = true, length = 20)
	private String telefone2;
	
	@Column(name="whatsapp", nullable = true, length = 20)
	private String whatsapp;
	
	@Column(name="celular", nullable = true, length = 20)
	private String celular;
	
	@Column(name="email", nullable = true, length = 64)
	private String email;
	
	@Column(name="website", nullable = true, length = 64)
	private String website;
	
	@Column(name="data_cadastro", nullable = true, length = 10)
	private LocalDate dataDoCadastro;
	
	@Column(name="status_favorecido", nullable = true, length = 10)
	private String statusFavorecido;
	
	@Column(name="certificador", nullable = false, length = 36)
	private String certificador;
	
	public Favorecido() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public LocalDate getDataDeConstituicao() {
		return dataDeConstituicao;
	}

	public void setDataDeConstituicao(LocalDate dataDeConstituicao) {
		this.dataDeConstituicao = dataDeConstituicao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public String getRegimeTributario() {
		return regimeTributario;
	}

	public void setRegimeTributario(String regimeTributario) {
		this.regimeTributario = regimeTributario;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public LocalDate getDataDoCadastro() {
		return dataDoCadastro;
	}

	public void setDataDoCadastro(LocalDate dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}

	public String getStatusFavorecido() {
		return statusFavorecido;
	}

	public void setStatusFavorecido(String statusFavorecido) {
		this.statusFavorecido = statusFavorecido;
	}

	public String getCertificador() {
		return certificador;
	}

	public void setCertificador(String certificador) {
		this.certificador = certificador;
	}

	@Override
	public String toString() {
		return "Favorecido [id=" + id + ", cpfCnpj=" + cpfCnpj + ", nome=" + nome + ", nomeFantasia=" + nomeFantasia
				+ ", razaoSocial=" + razaoSocial + ", dataDeNascimento=" + dataDeNascimento + ", dataDeConstituicao="
				+ dataDeConstituicao + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", inscricaoEstadual="
				+ inscricaoEstadual + ", inscricaoMunicipal=" + inscricaoMunicipal + ", codigoIbge=" + codigoIbge
				+ ", regimeTributario=" + regimeTributario + ", cep=" + cep + ", endereco=" + endereco + ", numero="
				+ numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado="
				+ estado + ", telefone=" + telefone + ", telefone2=" + telefone2 + ", whatsapp=" + whatsapp
				+ ", celular=" + celular + ", email=" + email + ", website=" + website + ", dataDoCadastro="
				+ dataDoCadastro + ", statusFavorecido=" + statusFavorecido + ", certificador=" + certificador + "]";
	}
}
	