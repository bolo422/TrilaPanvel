package br.com.panvel.gerenciador.modelo;

import java.util.Date;

public class Company {

	private Integer id;
	private String name;
	private Date openingDate;
	
	
	public Company(String name, Date openingDate) {
		this.name = name;
		this.openingDate = openingDate;
		id = DataBase.addLastID();
	}
	
	public Company(String name) {
		this(name, new Date());
	}

	public Integer getId() {
		return id;
	}
	
	public void setID(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Date getOpeningDate() {
		return openingDate;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDate(Date openingDate) {
		this.openingDate = openingDate;
	}
}
