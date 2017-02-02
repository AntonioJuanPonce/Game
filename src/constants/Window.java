package constants;

import java.awt.Dimension;

import game.Game;

public class Window
{
	public static final int width = Game.tile_size * 10;
	public static final int height = Game.tile_size * 10;
	public static final Dimension window_d = new Dimension(width, height);
}