package com.generation.minhaLoja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.sun.istack.NotNull;

@Entity

@Table(name= "tb_categoria")

public class Categoria 
{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min= 5, max= 100)
	private String categoria;

	@Size(min=5, max=100)
	private String genero;

	@NotNull
	@Size(min= 10, max= 500)
	private String descricao;

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getCategoria() 
	{
		return categoria;
	}

	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}

	public String getGenero() 
	{
		return genero;
	}

	public void setGenero(String genero) 
	{
		this.genero = genero;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}
	
	
	
	
}
