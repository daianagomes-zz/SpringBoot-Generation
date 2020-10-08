package com.generation.minhaLoja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="tb_produto")
public class Produto {
//id, nome e valor
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min= 5, max= 500)
	private String nome;

	
	@NotNull
	private double valor;

	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Categoria categoria;

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getNome() 
	{
		
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	
	public double getValor() 
	{
		return valor;
	}

	public void setValor(double valor) 
	{
		this.valor = valor;
	}

	public Categoria getCategoria() 
	{
		return categoria;
	}

	public void setCategoria(Categoria categoria) 
	{
		this.categoria = categoria;
	}
}