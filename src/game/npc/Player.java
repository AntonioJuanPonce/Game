package game.npc;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import game.map.Map;

public class Player extends NPC
{
	public boolean left_key;
	public boolean right_key;
	public boolean up_key;
	public boolean down_key;
	
	public final int left = KeyEvent.VK_A;
	public final int right = KeyEvent.VK_D;
	public final int up = KeyEvent.VK_W;
	public final int down = KeyEvent.VK_S;
	public Player(double x,double y)
	{
		super(x,y,1,1);
	}
	public void tick(Map map)
	{
		
	}
	@Override
	public void draw(Graphics g,Map map)
	{
		
	}
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case left:
				left_key = true;
				break;
			case right:
				right_key = true;
				break;
			case down:
				down_key = true;
				break;
			case up:
				up_key = true;
				break;
		}
	}
	public void keyRealessed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case left:
				left_key = false;
				break;
			case right:
				right_key = false;
				break;
			case down:
				down_key = false;
				break;
			case up:
				up_key = false;
				break;
		}
	}
}