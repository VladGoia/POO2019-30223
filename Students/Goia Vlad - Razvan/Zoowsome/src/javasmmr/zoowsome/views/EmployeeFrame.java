package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class EmployeeFrame extends ZooFrame {

	private JButton btnCaretaker;
	private JButton btnInvestor;
	private JButton btnManagaer;

	public EmployeeFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnCaretaker = new JButton("Caretaker");   
		slPanel.putConstraint(SpringLayout.NORTH, btnCaretaker, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnCaretaker, 90, SpringLayout.WEST, pan);   
		pan.add(btnCaretaker);

		btnInvestor = new JButton("Investor");   
		slPanel.putConstraint(SpringLayout.NORTH, btnInvestor, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnInvestor, 90, SpringLayout.WEST, pan);   
		pan.add(btnInvestor); 

		btnManagaer = new JButton("Managaer");   
		slPanel.putConstraint(SpringLayout.NORTH, btnManagaer, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnManagaer, 90, SpringLayout.WEST, pan);   
		pan.add(btnManagaer);  

		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}

	public void setCaretakerButtonActionListener(ActionListener a) {
		btnCaretaker.addActionListener(a);
	}

	public void setInvestorButtonActionListener(ActionListener a) {
		btnInvestor.addActionListener(a);
	}

	public void setManagerButtonActionListener(ActionListener a) {
		btnManagaer.addActionListener(a);
	}

	@Override
	public void goBack() {
	}

}