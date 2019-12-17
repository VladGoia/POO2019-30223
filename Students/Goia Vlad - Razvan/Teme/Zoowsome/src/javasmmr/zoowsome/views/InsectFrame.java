package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class InsectFrame extends ZooFrame{

	private JButton btnButterfly;
	private JButton btnCockroach;
	private JButton btnSpider;

	public InsectFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnButterfly = new JButton("Butterfly");   
		slPanel.putConstraint(SpringLayout.NORTH, btnButterfly, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnButterfly, 90, SpringLayout.WEST, pan);   
		pan.add(btnButterfly);

		btnCockroach = new JButton("Cockroach");   
		slPanel.putConstraint(SpringLayout.NORTH, btnCockroach, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnCockroach, 90, SpringLayout.WEST, pan);   
		pan.add(btnCockroach); 

		btnSpider = new JButton("Spider");   
		slPanel.putConstraint(SpringLayout.NORTH, btnSpider, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSpider, 90, SpringLayout.WEST, pan);   
		pan.add(btnSpider); 

		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnButterfly.addActionListener(a);
	}

	public void setAquaticButtonActionListener(ActionListener a) {
		btnCockroach.addActionListener(a);
	}

	public void setInsectButtonActionListener(ActionListener a) {
		btnSpider.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}