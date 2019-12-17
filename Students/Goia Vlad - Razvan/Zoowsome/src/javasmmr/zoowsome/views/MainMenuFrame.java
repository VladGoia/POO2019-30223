package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MainMenuFrame extends ZooFrame { 

	 private JButton btnAdd;  
	 private JButton btnList;  
	 private JButton btnSaveAndExit; 

	 public MainMenuFrame(String title) {
		 super(title);   
		 contentPanel.setLayout(new GridLayout(0, 3, 0, 0)); 

		 JPanel panel = new JPanel();  
		 contentPanel.add(panel); 

		 JPanel pan = new JPanel();   
		 contentPanel.add(pan);   
		 SpringLayout slPanel = new SpringLayout();   
		 pan.setLayout(slPanel); 

		 btnAdd = new JButton("Add");   
		 slPanel.putConstraint(SpringLayout.NORTH, btnAdd, 120, SpringLayout.NORTH, pan);   
		 slPanel.putConstraint(SpringLayout.WEST, btnAdd, 90, SpringLayout.WEST, pan);   
		 pan.add(btnAdd); 

		 btnList = new JButton("List");   
		 slPanel.putConstraint(SpringLayout.NORTH, btnList, 160, SpringLayout.NORTH, pan);   
		 slPanel.putConstraint(SpringLayout.WEST, btnList, 90, SpringLayout.WEST, pan);   
		 pan.add(btnList); 

		 btnSaveAndExit = new JButton("Save and Exit");   
		 slPanel.putConstraint(SpringLayout.NORTH, btnSaveAndExit, 200, SpringLayout.NORTH, pan); 
		 slPanel.putConstraint(SpringLayout.WEST, btnSaveAndExit, 90, SpringLayout.WEST, pan);   
		 pan.add(btnSaveAndExit); 

		 JPanel panel_2 = new JPanel();   
		 contentPanel.add(panel_2);   
		 setVisible(true); 

	  } 

	 public void setAddButtonActionListener(ActionListener a) {   btnAdd.addActionListener(a);  } 

	 public void setListButtonActionListener(ActionListener a) {   btnList.addActionListener(a);  } 

	 public void setSaveAndExitButtonActionListener(ActionListener a) {   btnSaveAndExit.addActionListener(a);  }

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	} 

} 