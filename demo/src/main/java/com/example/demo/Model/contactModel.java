package com.example.demo.Model;

public class contactModel {
	private int id;
	private String name;
	private String telefono;

	public contactModel() {}

	public contactModel(int id, String name, String telefono) {
		this.id = id;
		this.name = name;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "contactModel [id="
		+ id + 
		", name=" + name + 
		", telefono=" + telefono + "]";
	}

}
