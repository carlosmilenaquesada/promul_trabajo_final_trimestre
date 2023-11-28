package com.example.promul_trabajo_final_trimestre;

public class Producto{
	private String nombre;
	private String plataforma;
	private String genero;
	private double precio;

	public Producto(){
		this.nombre = "";
		this.plataforma = "";
		this.genero = "";
		this.precio = 0.0;

	}

	public Producto(String nombre, String plataforma, String genero, double precio){
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.genero = genero;
		this.precio = precio;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getPlataforma(){
		return plataforma;
	}

	public void setPlataforma(String plataforma){
		this.plataforma = plataforma;
	}

	public String getGenero(){
		return genero;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}

	public double getPrecio(){
		return precio;
	}

	public void setPrecio(double precio){
		this.precio = precio;
	}
}
