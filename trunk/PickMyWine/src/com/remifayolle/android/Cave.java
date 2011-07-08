package com.remifayolle.android;

public class Cave {
	/** Internal data */
	private int id;
	private String name;
	private int tempMin;
	private int tempMax;

	/** Constructors */
	public Cave()
	{
		this.setId(0);
		this.setName("NULL-cave");
		this.setTempMin(0);
		this.setTempMax(100);
	}



	/** Getter and Setters */
	int getId() {
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

	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}

	public int getTempMin() {
		return tempMin;
	}

	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}

	public int getTempMax() {
		return tempMax;
	}



	/** Debug */
	public String toString()
	{
		return "ID : "+id+"\nNom : "+name+"\nTempMin : "+tempMin+"\nTempMax : "+tempMax;
	}
}
