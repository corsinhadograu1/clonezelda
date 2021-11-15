package com.gustavixx.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	private BufferedImage spritesheet;
	
	public Spritesheet(String pach)
	{
		try {
			spritesheet = ImageIO.read(getClass().getResource(pach));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage getSprite(int x,int y,int width,int heigth) {
		return spritesheet.getSubimage(x, y, width, heigth);
		
	}

	
	
}
