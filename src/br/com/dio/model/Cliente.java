package br.com.dio.model;

import java.util.Objects;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String animal;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String endereco, String animal) {
		this.nome = nome;
		this.endereco = endereco;
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(animal, endereco, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(animal, other.animal) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cliente [nome= Jose " + this.nome + ", endereco= Avenida Getúlio Vargas" + this.endereco + ", animal= Frajola" + animal + "]";
	}

}
