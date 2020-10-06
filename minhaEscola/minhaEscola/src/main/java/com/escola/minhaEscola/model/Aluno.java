package com.escola.minhaEscola.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;


@Entity
@Table(name = "tb_aluno")
public class Aluno 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String nome;
	
	@NotNull
	private boolean matriculado;

	public long getID() 
	{
		return ID;
	}

	public void setID(long iD) 
	{
		ID = iD;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public boolean isMatriculado() 
	{
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) 
	{
		this.matriculado = matriculado;
	}
	
	
	

}



