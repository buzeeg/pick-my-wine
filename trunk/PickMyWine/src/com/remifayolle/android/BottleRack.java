package com.remifayolle.android;

public class BottleRack {
	/** Internal data */
	private int id;
	private String desc;
	private int nbRows;
	private int nbColumns;
	
	
	/** Constructors */
	public BottleRack()
	{
		this.setId(0);
		this.setDesc("NULL-rack");
		this.setNbRows(0);
		this.setNbColumns(0);
	}
	
	
	
	/** Getter and Setters */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getNbRows() {
		return nbRows;
	}

	public void setNbRows(int nbRows) {
		this.nbRows = nbRows;
	}

	public int getNbColumns() {
		return nbColumns;
	}

	public void setNbColumns(int nbColumns) {
		this.nbColumns = nbColumns;
	}
	
	
	/** Debug */
	public String toString()
	{
		return "ID : "+id+"\nDesc : "+desc+"\nNbRows : "+nbRows+"\nNbColumns : "+nbColumns;
	}
}
