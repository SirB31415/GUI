package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set the color:D
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.add(firstButton);
		this.setLayout(appLayout);
	}

	/*
	 * Used to hold the constraint positioning for Spring Layout.
	 * AKA the giant dumping ground for all the xxx.putConstraint(...) lines.
	 */
	private void setupLayout()
	{
//if code says .putConstraint, put it in setupLayout
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 125, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, -135, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
//actionPerformed and ActionEvent are required
			public void actionPerformed(ActionEvent click)
			{
//This is where the code goes that you want executed when clicked.
				changeScreenColor();
			}
		});
	}
	private void changeScreenColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() *256);
		int blue = (int) (Math.random() *256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
