package gui.creation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dvd.DVD;
import gui.Frame;
import media.MediaId;

public class CreateDVD extends CreateMedia {
	private JTextField txtDirector;
	private JTextField txtLength;

	/**
	 * Create the panel.
	 */
	public CreateDVD() {
		
		JLabel lblCreateType = new JLabel("New DVD");
		lblCreateType.setBounds(487, 49, 101, 14);
		add(lblCreateType);
		
		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDirector.setBounds(229, 261, 62, 14);
		add(lblDirector);
		
		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(306, 258, 471, 20);
		add(txtDirector);
		
		JLabel lblLength = new JLabel("Length:");
		lblLength.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLength.setBounds(229, 314, 62, 14);
		add(lblLength);
		
		txtLength = new JTextField();
		txtLength.setColumns(10);
		txtLength.setBounds(306, 311, 471, 20);
		add(txtLength);
		
		getBtnAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DVD dvd = new DVD(getTxtTitle().getText(), getTxtCategory().getText(), txtDirector.getText(), Integer.parseInt(txtLength.getText()), Float.parseFloat(getTxtCost().getText()), MediaId.DVD);
				Frame.aims.lstProducts.add(dvd);
			}
		});

	}
}
