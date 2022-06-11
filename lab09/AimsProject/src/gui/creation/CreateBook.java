package gui.creation;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import book.Book;
import gui.Frame;
import media.MediaId;

import javax.swing.JTextField;

public class CreateBook extends CreateMedia {
	private JTextField txtContent;

	/**
	 * Create the panel.
	 */
	public CreateBook() {
		
		JLabel lblNewBook = new JLabel("New Book");
		lblNewBook.setBounds(487, 50, 89, 14);
		add(lblNewBook);
		
		JLabel lblContent = new JLabel("Content:");
		lblContent.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContent.setBounds(229, 262, 62, 14);
		add(lblContent);
		
		txtContent = new JTextField();
		txtContent.setColumns(10);
		txtContent.setBounds(306, 259, 471, 20);
		add(txtContent);

		getBtnAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book book = new Book(getTxtTitle().getText(), getTxtCategory().getText(), txtContent.getText(), Float.parseFloat(getTxtCost().getText()), MediaId.Book);
				Frame.aims.lstProducts.add(book);
			}
		});
	}

}
