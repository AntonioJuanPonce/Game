package game.map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import game.Game;
import game.npc.NPC;
import game.npc.Player;

public class Map
{
	public int[][] tiles;
	public BufferedImage[] tile_set;
	public BufferedImage[] sprite_sheet;
	public NPC[] npcs;
	public Player player;
	
	public Map(int[][] tiles, BufferedImage[] tileset,NPC[] npcs, Player player, BufferedImage[] sprite_sheet)
	{
		this.tiles = tiles;
		this.tile_set = tileset; //It is assumed that the tiles are the 
								///same size in Pixels as Game.tile_size
		this.npcs = npcs;
		this.player = player;
		this.sprite_sheet = sprite_sheet;
	}
	
	public void tick()
	{
		player.tick(this);
		for(int i = 0; i < npcs.length; i++)
		{
			npcs[i].tick(this);
		}
	}
	public void draw(Graphics g)
	{
		//Draw the map.
		for(int row = 0; row < tiles.length; row++)
		{
			for(int col = 0; col < tiles[row].length; col++)
			{
				if(tiles[row][col] >= tile_set.length)
				{
					drawMissingTexture( g, row * Game.tile_size, col * Game.tile_size);
				}else
				{
					g.drawImage
					(
						tile_set[tiles[row][col]],
						row * Game.tile_size,
						col * Game.tile_size,
						null
					);
				}
			}
		}
		
		for(int i = 0; i < npcs.length; i++)
		{
			npcs[i].draw(g,this);
		}
	}
	public void drawMissingTexture(Graphics g, int x, int y)
	{
		//Draw the tile as a missing texture.
		g.setColor(Color.magenta);
		g.fillRect
		(
			x,
			y,
			Game.tile_size,
			Game.tile_size
		);
		
		g.setColor(Color.black);
		g.fillRect
		(
			x,
			y,
			Game.tile_size / 2,
			Game.tile_size /2
		);
		g.fillRect
		(
			x + Game.tile_size / 2,
			y + Game.tile_size / 2,
			Game.tile_size / 2,
			Game.tile_size / 2
		);
	}
	public void keyEvent()
	{
		
	}
}