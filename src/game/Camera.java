package game;

import constants.Window;
import game.npc.NPC;

public class Camera
{
	public static double x;
	public static double y;
	
	//NPC to focus on.
	public static NPC focus;
	
	public static double x_border_pos;
	public static double x_border_neg;
	public static double y_border_pos;
	public static double y_border_neg;
	
	public static void update()
	{
		//Left follow.
		if(focus.x < x + x_border_neg)
		{
			x++;
		}
		
		//Right follow.
		if(focus.x + focus.width > x + ((double)(Window.width) / (double)(Game.tile_size)) - x_border_pos)
		{
			x--;
		}
		
		//Upper follow.
		if(focus.y < y + y_border_neg)
		{
			y++;
		}
		
		//Down follow.
		if(focus.y + focus.height > y + ((double)(Window.height) / (double)(Game.tile_size)) - y_border_pos)
		{
			y--;
		}
	}
}
