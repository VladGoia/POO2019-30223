package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class BirdFrame extends ZooFrame{

	private JButton btnHawk;
	private JButton btnEagle;
	private JButton btnPigeon;

	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnHawk = new JButton("Hawk");   
		slPanel.putConstraint(SpringLayout.NORTH, btnHawk, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnHawk, 90, SpringLayout.WEST, pan);   
		pan.add(btnHawk);

		btnEagle = new JButton("Eagle");   
		slPanel.putConstraint(SpringLayout.NORTH, btnEagle, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnEagle, 90, SpringLayout.WEST, pan);   
		pan.add(btnEagle); 

		btnPigeon = new JButton("Pigeon");   
		slPanel.putConstraint(SpringLayout.NORTH, btnPigeon, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnPigeon, 90, SpringLayout.WEST, pan);   
		pan.add(btnPigeon); 

		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnHawk.addActionListener(a);
	}

	public void setAquaticButtonActionListener(ActionListener a) {
		btnEagle.addActionListener(a);
	}

	public void setInsectButtonActionListener(ActionListener a) {
		btnPigeon.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}