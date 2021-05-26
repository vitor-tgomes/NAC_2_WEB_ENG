package br.com.fiap.convidados.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.fiap.convidados.dto.ConvidadoDto;

@Entity
@Table(name = "tb_convidados")
public class ConvidadoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private String numero;
	private String cidade;
	private String estado;
	private String cep;
	private String cpf;
	private String rg;
	private String datanascimento;
	private String telresidencial;
	private String celular;
	private String tipfinan;
	private String quantparc;
	private String valint;
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
	
	ConvidadoDto toCondidadoDto(){
		ConvidadoDto convidadoDto = new ConvidadoDto();
		
		convidadoDto.setEndereco(this.endereco);
		convidadoDto.setNome(this.nome);
		convidadoDto.setEmail(this.email);
		convidadoDto.setNumero(this.numero);
		convidadoDto.setCidade(this.cidade);
		convidadoDto.setEstado(this.estado);
		convidadoDto.setCep(this.cep);
		convidadoDto.setCpf(this.cpf);
		convidadoDto.setRg(this.rg);
		convidadoDto.setDatanascimento(this.datanascimento);
		convidadoDto.setTelresidencial(this.telresidencial);
		convidadoDto.setCelular(this.celular);
		convidadoDto.setTipfinan(this.tipfinan);
		convidadoDto.setQuantparc(this.quantparc);
		convidadoDto.setValint(this.valint);
		convidadoDto.setSalario(this.salario);
		
		return convidadoDto;
	}
}
