package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ReptileFrame extends ZooFrame {

	private JButton btnGecko;
	private JButton btnSnake;
	private JButton btnCrocodile;

	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnGecko = new JButton("Gecko");   
		slPanel.putConstraint(SpringLayout.NORTH, btnGecko, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnGecko, 90, SpringLayout.WEST, pan);   
		pan.add(btnGecko);

		btnSnake = new JButton("Snake");   
		slPanel.putConstraint(SpringLayout.NORTH, btnSnake, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnSnake, 90, SpringLayout.WEST, pan);   
		pan.add(btnSnake); 

		btnCrocodile = new JButton("Crocodile");   
		slPanel.putConstraint(SpringLayout.NORTH, btnCrocodile, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnCrocodile, 90, SpringLayout.WEST, pan);   
		pan.add(btnCrocodile); 

		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnGecko.addActionListener(a);
	}

	public void setAquaticButtonActionListener(ActionListener a) {
		btnSnake.addActionListener(a);
	}

	public void setInsectButtonActionListener(ActionListener a) {
		btnCrocodile.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}