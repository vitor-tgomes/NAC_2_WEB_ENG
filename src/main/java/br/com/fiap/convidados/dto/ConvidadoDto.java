package br.com.fiap.convidados.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import br.com.fiap.convidados.entity.ConvidadoEntity;

public class ConvidadoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@NotBlank
	
	private String nome;
	@NotBlank
	
	private String email;
	
	@NotBlank
	private String endereco;
	
	@NotBlank
	private String numero;
	
	@NotBlank
	private String cidade;
	
	@NotBlank
	private String estado;
	
	@NotBlank
	private String cep;
	
	@NotBlank
	private String cpf;
	
	@NotBlank
	private String rg;
	
	@NotBlank
	private String datanascimento;
	
	@NotBlank
	private String telresidencial;
	
	@NotBlank
	private String celular;
	
	@NotBlank
	private String tipfinan;
	
	@NotBlank
	private String quantparc;
	
	@NotBlank
	private String valint;
	
	@NotBlank
	private String salario;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getTelresidencial() {
		return telresidencial;
	}
	public void setTelresidencial(String telresidencial) {
		this.telresidencial = telresidencial;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTipfinan() {
		return tipfinan;
	}
	public void setTipfinan(String tipfinan) {
		this.tipfinan = tipfinan;
	}
	public String getQuantparc() {
		return quantparc;
	}
	public void setQuantparc(String quantparc) {
		this.quantparc = quantparc;
	}
	public String getValint() {
		return valint;
	}
	public void setValint(String valint) {
		this.valint = valint;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	public ConvidadoEntity toConvidadoEntity(){
		ConvidadoEntity convidadoEntity = new ConvidadoEntity();
		convidadoEntity.setEndereco(this.endereco);
		convidadoEntity.setNome(this.nome);
		convidadoEntity.setEmail(this.email);
		convidadoEntity.setNumero(this.numero);
		convidadoEntity.setCidade(this.cidade);
		convidadoEntity.setEstado(this.estado);
		convidadoEntity.setCep(this.cep);
		convidadoEntity.setCpf(this.cpf);
		convidadoEntity.setRg(this.rg);
		convidadoEntity.setDatanascimento(this.datanascimento);
		convidadoEntity.setTelresidencial(this.telresidencial);
		convidadoEntity.setCelular(this.celular);
		convidadoEntity.setTipfinan(this.tipfinan);
		convidadoEntity.setQuantparc(this.quantparc);
		convidadoEntity.setValint(this.valint);
		convidadoEntity.setSalario(this.salario);
		
		return convidadoEntity;		
	}
	
}
