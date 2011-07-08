package com.remifayolle.android;

public class Bottle {
	/** Internal data */
	private int id;
	private String name;
	private int year;
	private int garde;
	private int price;
	private String type;
	
	/** Constructors */
	public Bottle(){
		this.setID(0);
		this.setName("NULL-name");
		this.setYear(2000);
		this.setGarde(0);
		this.setPrice(1);
		this.setType("NULL-type");
	}
	
	public Bottle(String name, int year, int garde, int price, String type)
	{
		this.setID(1);
		this.setName(name);
		this.setYear(year);
		this.setGarde(garde);
		this.setPrice(price);
		this.setType(type);
	}

	
	/** Getter and Setters */
	public int getID()
	{
		return id;
	}
	
	public void setID(int i)
	{
		id = i;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public void setGarde(int garde) {
		this.garde = garde;
	}

	public int getGarde() {
		return garde;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
	/** Debug */
	public String toString()
	{
		return "ID : "+id+"\nNom : "+name+"\nAnnée : "+year+"\nGarde : "+garde+"\nPrix : "+price+"\nType : "+type;
	}
}
