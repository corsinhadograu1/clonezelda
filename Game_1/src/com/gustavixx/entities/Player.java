package com.gustavixx.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gustavixx.main.Game;

public class Player extends Entity {
	
	public boolean rigth,up,left,down;
	public int rigth_dir = 0,left_dir = 1;
	public int dir = rigth_dir;
    public double speed = 1.4;
    
    private int frames=0, maxFrames = 5,index = 0,maxIndex =3;
    private boolean moved = false;
    private BufferedImage[] rigthPlayer;
    private BufferedImage[] leftPlayer;

	public Player(int x, int y, int width, int heigth, BufferedImage sprite) {
		super(x, y, width, heigth, sprite);
		
		rigthPlayer = new BufferedImage[4];
		leftPlayer = new BufferedImage[4];
		for(int i = 0; i < 4; i++) {
		rigthPlayer[i] = Game.spritesheet.getSprite(32 + (i*16), 0, 16, 16);		
				}
		for(int i = 0; i < 4; i++) {
			leftPlayer[i] = Game.spritesheet.getSprite(32 + (i*16), 16, 16, 16);
		}
		
	}
		
		
	
	
	public void tick() {
		moved = false;
		if(rigth) {
			moved = true;
			dir = rigth_dir;
			x+=speed;
		}
		else if(left) {
			moved = true;
			x-=speed;
			dir = left_dir;
		}
		if(up) {
			moved = true;
			y-=speed;
		}
			else if(down) {
				moved = true;
				y+=speed;
			}
		
		if (moved) {
			frames++;
			if(frames == maxFrames) {
				frames = 0;
				index++;
				if(index > maxIndex)
					index = 0;
			}
		}
	}
	
	
	public void render (Graphics g){
		if(dir == rigth_dir) {
		g.drawImage(rigthPlayer[index], this.getX(), this.getY(), null);
		}else if (dir == left_dir) {
			g.drawImage(leftPlayer[index], this.getX(), this.getY(), null);
		}
	}

	

		
		
	
			
		
		
			
		
		
		

		
	{
			
		}
		
	

		
	}
	
	
		
		
	
	 
	




