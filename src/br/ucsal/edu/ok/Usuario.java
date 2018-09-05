package br.ucsal.edu.ok;

public class Usuario {
private String id;
private String nome;
public String getId() {
	return id;
}



@Override
public String toString() {
	return "Usuario [nome=" + nome + "]";
}



public void setId(String id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
private String senha;
}
