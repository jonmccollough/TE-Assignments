package com.techelevator;

public class Wall {
	
	private int height; // need a getter and setter
	private int width;
	
	public Wall() { // default constructor: class name ()
		height = 10;
		width = 10;
	}
	
	public Wall( int height, int width ) {
		this.height = height;
		this.width = width;
	}
	
	//derived property
	public int getSurfaceArea() {
		return( height * width );
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	

}
