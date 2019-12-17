package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AquaticFrame extends ZooFrame {

	private JButton btnCrab;
	private JButton btnFrog;
	private JButton btnShark;

	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnCrab = new JButton("Crab");   
		slPanel.putConstraint(SpringLayout.NORTH, btnCrab, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnCrab, 90, SpringLayout.WEST, pan);   
		pan.add(btnCrab);

		btnFrog = new JButton("Frog");   
		slPanel.putConstraint(SpringLayout.NORTH, btnFrog, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnFrog, 90, SpringLayout.WEST, pan);   
		pan.add(btnFrog); 

		btnShark = new JButton("Shark");   
		slPanel.putConstraint(SpringLayout.NORTH, btnShark, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnShark, 90, SpringLayout.WEST, pan);   
		pan.add(btnShark); 

		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnCrab.addActionListener(a);
	}

	public void setAquaticButtonActionListener(ActionListener a) {
		btnFrog.addActionListener(a);
	}

	public void setInsectButtonActionListener(ActionListener a) {
		btnShark.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}