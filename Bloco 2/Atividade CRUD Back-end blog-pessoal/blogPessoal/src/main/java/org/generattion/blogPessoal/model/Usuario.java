package org.generattion.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
	
	
	private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) long id;
	
    private @NotNull @Size(min = 4, max = 100) String nome;
	
	private @NotNull @Size (min = 4, max = 100) String usuario;
	
	private @NotNull @Size (min = 4, max = 100) String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
