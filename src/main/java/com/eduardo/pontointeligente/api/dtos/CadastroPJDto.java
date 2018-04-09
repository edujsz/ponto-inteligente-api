package com.eduardo.pontointeligente.api.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class CadastroPJDto {
	
	private Long id;
	private String nome;
	private String senha;
	private String email;
	private String cpf;
	private String razaoSocial;
	private String cnpj;
	
	public CadastroPJDto() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotEmpty(message= "Não pode ser vazio")
	@Length(min=3,max=200, message ="Nome deve conter entre 1 e 200 caracteres")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@NotEmpty(message= "Senha não pode ser vazia")
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@NotEmpty(message= "Não pode ser vazio")
	@Length(min=3,max=200, message ="Email deve conter entre 1 e 200 caracteres")
	@Email(message ="Email Inválido")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotEmpty(message= "Não pode ser vazio")
	@Length(min=3,max=200, message ="CPF deve conter entre 1 e 200 caracteres")
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@NotEmpty(message= "Não pode ser vazio")
	@Length(min=3,max=200, message ="Razão Social deve conter entre 1 e 200 caracteres")
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@NotEmpty(message= "Não pode ser vazio")
	@Length(min=3,max=200, message ="CNPJ deve conter entre 1 e 200 caracteres")
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
