package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MammalFrame extends ZooFrame {

	private JButton btnCow;
	private JButton btnTiger;
	private JButton btnMonkey;

	public MammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnCow = new JButton("Cow");   
		slPanel.putConstraint(SpringLayout.NORTH, btnCow, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnCow, 90, SpringLayout.WEST, pan);   
		pan.add(btnCow);

		btnTiger = new JButton("Tiger");   
		slPanel.putConstraint(SpringLayout.NORTH, btnTiger, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnTiger, 90, SpringLayout.WEST, pan);   
		pan.add(btnTiger); 

		btnMonkey = new JButton("Monkey");   
		slPanel.putConstraint(SpringLayout.NORTH, btnMonkey, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnMonkey, 90, SpringLayout.WEST, pan);   
		pan.add(btnMonkey); 

		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnCow.addActionListener(a);
	}

	public void setAquaticButtonActionListener(ActionListener a) {
		btnTiger.addActionListener(a);
	}

	public void setInsectButtonActionListener(ActionListener a) {
		btnMonkey.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}