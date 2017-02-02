package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public interface Screen
{
	public int getRefreshRate();
	public int getTickRate();
	
	public void draw(Graphics g);
	public void tick();
	
	public void keyPress(KeyEvent e);
	public void keyRealese(KeyEvent e);
}