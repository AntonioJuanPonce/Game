package game.physics;

import constants.Physics;

public class Hitbox
{
	public final Point[] points;
	
	// Instantiate a hit-box with a grid of points.
	public Hitbox(double x, double y,double width, double height)
	{
		points = new Point
		[
			(int)
			(
				(width / Physics.precision)
				+
				(height / Physics.precision)
				+
				4.0
			)			
		];
		
		//Create grid.
		int i = 0;
		for(double xIndex = 0;xIndex < width;xIndex+=Physics.precision)
		{
			for(double yIndex = 0;yIndex < height;yIndex+=Physics.precision)
			{
				//points[i].x = (xIndex*Physics.precision) + x;
				//points[i].y = (yIndex*Physics.precision) + y;
				points[i] = new Point
				(
					(xIndex*Physics.precision) + x,
					(yIndex*Physics.precision) + y
				);
				i++;
			}
		}
		
		//Upper left point
		points[points.length - 4] = new Point(x,y);
		
		//Lower left point
		points[points.length - 3] = new Point(x,y + height);
		
		//Upper right point
		points[points.length - 2] = new Point(x + width,y);
		
		//Lower right point
		points[points.length - 1] = new Point(x + width,y + height);
		
	}
	public Point collideWithTile()
	{
		return new Point();
	}
}
