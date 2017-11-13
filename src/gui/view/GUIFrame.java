package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	
//This is the constructor
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		setupFrame();
	}
	private void setupFrame()
	{
		this.setTitle("Window title will go here");
		this.setSize(500,500);
		
//this is a necessary part of every setupFrame
		this.setVisible(true);
	}
	
}
