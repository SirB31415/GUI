//This is the default frame class
package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel appPanel;
	
//This is the constructor
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		setupFrame();
	}
	private void setupFrame()
	{
//This is preferrably the first line of setupFrame
		this.setContentPane(appPanel);
		this.setTitle("Window title will go here");
		this.setSize(500,500);
//this is a necessary part of every setupFrame
		this.setVisible(true);
	}
	
}
