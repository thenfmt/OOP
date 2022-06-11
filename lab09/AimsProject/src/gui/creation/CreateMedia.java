package gui.creation;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gui.Frame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateMedia extends JPanel {
	private JTextField txtTitle;
	private JTextField txtCategory;
	private JTextField txtCost;
	private JButton btnAdd;

	/**
	 * Create the panel.
	 */
	public CreateMedia() {
		setBounds(0, 0, 1064, 655);
		setLayout(null);
		
		JLabel lblTitle = new JLabel("Title: ");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setBounds(229, 104, 62, 14);
		add(lblTitle);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(306, 101, 471, 20);
		add(txtTitle);
		txtTitle.setColumns(10);
		
		JLabel lblCategoy = new JLabel("Category:");
		lblCategoy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoy.setBounds(229, 156, 62, 14);
		add(lblCategoy);
		
		txtCategory = new JTextField();
		txtCategory.setColumns(10);
		txtCategory.setBounds(306, 153, 471, 20);
		add(txtCategory);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCost.setBounds(229, 209, 62, 14);
		add(lblCost);
		
		txtCost = new JTextField();
		txtCost.setColumns(10);
		txtCost.setBounds(306, 206, 471, 20);
		add(txtCost);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(688, 463, 89, 23);
		add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.showAll();
			}
		});
		btnCancel.setBounds(306, 463, 89, 23);
		add(btnCancel);
	}

	public JTextField getTxtTitle() {
		return txtTitle;
	}

	public void setTxtTitle(JTextField txtTitle) {
		this.txtTitle = txtTitle;
	}

	public JTextField getTxtCategory() {
		return txtCategory;
	}

	public void setTxtCategory(JTextField txtCategory) {
		this.txtCategory = txtCategory;
	}

	public JTextField getTxtCost() {
		return txtCost;
	}

	public void setTxtCost(JTextField txtCost) {
		this.txtCost = txtCost;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}
}
