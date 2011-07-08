package com.remifayolle.android;

public class BottleRack {
	/** Internal data */
	private int id;
	private String desc;

	
	
	/** Constructors */
	public BottleRack()
	{
		this.setId(0);
		this.setDesc("NULL-rack");
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

	
	
	/** Debug */
	public String toString()
	{
		return "ID : "+id+"\nDesc : "+desc;
	}
}
