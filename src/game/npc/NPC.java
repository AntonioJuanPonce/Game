package game.npc;

import java.awt.Color;
import java.awt.Graphics;

import game.Game;
import game.map.Map;
import game.physics.Hitbox;

public abstract class NPC
{
	//The ID that the next NPC will have
	//when instantiated
	private static int CID = 0;
	//The ID of the NPC.
	public final int ID;
	
	
	public double x;
	public double y;
	public final double width;
	public final double height;
	public final Hitbox hitbox;
	
	/*
	 * Instantiate a rectangular NPC.
	 * */
	public NPC(double x,double y,double width,double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.hitbox = new Hitbox(x,y,width,height);
		ID = CID;
		CID++;
	}
	
	public abstract void tick(Map map);
	public void draw(Graphics g,Map map)
	{
		//Green represents missing texture.
		g.setColor(Color.GREEN);
		g.fillRect
		(
			(int)(x * Game.tile_size),
			(int)(y * Game.tile_size),
			(int)(width * Game.tile_size),
			(int)(height * Game.tile_size)
		);
	}
}