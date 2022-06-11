package gui.creation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dvd.DVD;
import gui.Frame;
import media.CompactDisc;
import media.MediaId;
import media.Track;

public class CreateCD extends CreateMedia {
	private JTextField txtLength;
	private JTextField txtDirector;
	private JTextField txtTrackLength;
	private JTextField txtTrackTitle;
	private CompactDisc cd = new CompactDisc();

	/**
	 * Create the panel.
	 */
	public CreateCD() {
		
		txtLength = new JTextField();
		txtLength.setColumns(10);
		txtLength.setBounds(306, 311, 471, 20);
		add(txtLength);
		
		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(306, 258, 471, 20);
		add(txtDirector);
		
		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDirector.setBounds(229, 261, 62, 14);
		add(lblDirector);
		
		JLabel lblLength = new JLabel("Length:");
		lblLength.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLength.setBounds(229, 314, 62, 14);
		add(lblLength);
		
		txtTrackLength = new JTextField();
		txtTrackLength.setColumns(10);
		txtTrackLength.setBounds(306, 391, 349, 20);
		add(txtTrackLength);
		
		txtTrackTitle = new JTextField();
		txtTrackTitle.setColumns(10);
		txtTrackTitle.setBounds(307, 360, 348, 20);
		add(txtTrackTitle);
		
		JLabel lblTrackTitle = new JLabel("Track title:");
		lblTrackTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTrackTitle.setBounds(230, 363, 62, 14);
		add(lblTrackTitle);
		
		JLabel lblTrackLength = new JLabel("Track length:");
		lblTrackLength.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTrackLength.setBounds(229, 394, 62, 14);
		add(lblTrackLength);
		
		JButton btnAddTrack = new JButton("AddTrack");
		btnAddTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Track track = new Track(txtTrackTitle.getText(), Integer.parseInt(txtTrackLength.getText()));
				cd.addTrack(track);
			}
		});
		btnAddTrack.setBounds(688, 376, 89, 23);
		add(btnAddTrack);
		
		JLabel lblType = new JLabel("New Compact Disc");
		lblType.setBounds(461, 49, 115, 14);
		add(lblType);
		
		getBtnAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createCd();
				Frame.aims.lstProducts.add(cd);
			}
		});
	}
	
	public void createCd() {
		cd.setTitle(getTxtTitle().getText());
		cd.setCategory(getTxtCategory().getText());
		cd.setDirector(txtDirector.getText());
		cd.setLength(Integer.parseInt(txtLength.getText()));
		cd.setCost(Float.parseFloat(getTxtCost().getText()));
		cd.setId(MediaId.CompactDisc);
	}

}
