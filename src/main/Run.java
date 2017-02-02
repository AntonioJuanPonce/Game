package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import constants.Window;
import game.Game;

public class Run extends JComponent implements ActionListener
{
	//The Screens
	public static Screen game = new Game();
	private static Screen current_screen = game;
	
	private static int time = 0;
	
	//The window.
	public  static JFrame window = new JFrame("Game");
	
	
	public static void main(String[] args)
	{
		Run run = new Run();
		
		window.add(run);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.addKeyListener
		(
			new KeyListener()
			{

				@Override
				public void keyPressed(KeyEvent e)
				{
					current_screen.keyPress(e);
				}
				@Override
				public void keyReleased(KeyEvent e)
				{
					current_screen.keyRealese(e);
				}
				@Override
				public void keyTyped(KeyEvent e)
				{
				}
			}	
		);
		
		Timer t = new Timer(1,run);
		t.start();
	}
	
	@Override
	public Dimension getPreferredSize()
	{
		return Window.window_d;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(getX() + "" + getY());
		time++;
		if(time % current_screen.getTickRate() == 0)
		{
			current_screen.tick();
		}
		if(time % current_screen.getRefreshRate() == 0)
		{
			repaint();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		current_screen.draw(g);
	}
	
	public int getTime()
	{
		return time;
	}
}