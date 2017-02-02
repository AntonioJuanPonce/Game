package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import constants.Window;
import main.Run;
import main.Screen;

public class Game implements Screen
{
	public static int tile_size = 48;
	
	public int getRefreshRate()
	{
		return 10;
	}
	
	public int getTickRate()
	{
		return 1;
	}
	
	public void tick()
	{
	}
	
	public void draw(Graphics g)
	{
	}
	
	public void keyPress(KeyEvent e)
	{
		System.out.println(e.getKeyCode());
	}
	
	public void keyRealese(KeyEvent e)
	{
		
	}
}