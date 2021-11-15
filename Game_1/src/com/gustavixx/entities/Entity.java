package com.gustavixx.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

//metodo construtor
public class Entity {
	
	protected double x;
	protected double width;
	protected int heigth;
	protected int y;
	
	private BufferedImage sprite;
	
	
	public Entity(int x,int y,int width,int heigth,BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
		this.sprite = sprite;
		
		//fim
	
		
	}
	
	public void setX(int newX) {
		this.x= newX;
		
	
	}
	public void setY(int newY) {
		this.y= newY;
	}
		
		
	
	public int getX() {
		return (int)this.x;
	}
	
	public int  getY() {
		return (int)this.y;
		
	
	}
	
	public int getWidth() {
		return  (int)this.width;
		
	}
	
	public int getHeigth() {
		return (int)this.heigth;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite,this.getX(),this.getY(),null);
	}

}