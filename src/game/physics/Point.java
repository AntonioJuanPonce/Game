package game.physics;

import game.map.Map;

public class Point
{
	private double x;
	private double y;
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public Point()
	{
		x = 0;
		y = 0;
	}
	public void changeX(double change)
	{
		x+=change;
	}
	public void changeY(double change)
	{
		y+=change;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public void setXY(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public Point Collide(Map map)
	{
		return new Point();
	}
}