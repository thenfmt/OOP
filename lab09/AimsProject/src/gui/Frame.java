package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import aims.Aims;
import gui.creation.CreateBook;
import gui.creation.CreateCD;
import gui.creation.CreateDVD;
import media.Media;
import media.MediaId;
import order.Order;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldSearch;
	private JPanel panelBar;
	private JButton btnCart;
	private JLabel lblSearch;
	public static JPanel panelBody;
	private JMenuBar menuBar;
	
	public static Aims aims = new Aims();
	public static Order order = new Order();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		
		
		//bar
		panelBar = new JPanel();
		panelBar.setBounds(0, 0, 1064, 46);
		getContentPane().add(panelBar);
		panelBar.setLayout(null);
		
		btnCart = new JButton("View Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCart();
			}
		});
		btnCart.setBounds(965, 11, 89, 23);
		panelBar.add(btnCart);
		
		
		lblSearch = new JLabel("Search: ");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSearch.setEnabled(false);
		lblSearch.setBounds(350, 14, 46, 14);
		panelBar.add(lblSearch);
		
		txtFieldSearch = new JTextField();
		txtFieldSearch.setText("Have not completed this feature yet");
		txtFieldSearch.setEnabled(false);
		txtFieldSearch.setBounds(397, 11, 251, 20);
		panelBar.add(txtFieldSearch);
		txtFieldSearch.setColumns(10);
		
		
		//menu
		JMenu menu = new JMenu("Menu");
		
		//menu update
		JMenu menuUpdate = new JMenu("Update Store");
		JMenuItem menuItemAddBook = new JMenuItem("Add Book"); 
		menuItemAddBook.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	panelBody.removeAll();
	            panelBody.setLayout(new GridLayout(1, 0, 0, 0));
	            panelBody.add(new CreateBook());
	        }
	    });
		menuUpdate.add(menuItemAddBook);
		
		JMenuItem menuItemAddCD = new JMenuItem("Add CD");
		menuItemAddCD.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	panelBody.removeAll();
	            panelBody.setLayout(new GridLayout(1, 0, 0, 0));
	            panelBody.add(new CreateCD());
	        }
	    });
		menuUpdate.add(menuItemAddCD);
		
		JMenuItem menuItemAddDVD = new JMenuItem("Add DVD");
		menuItemAddDVD.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            panelBody.removeAll();
	            panelBody.setLayout(new GridLayout(1, 0, 0, 0));
	            panelBody.add(new CreateDVD());
	        }
	    });
		menuUpdate.add(menuItemAddDVD);
		menu.add(menuUpdate);
		
		
		// menu sort
//		JMenu menuSort = new JMenu("Sort");
//		JMenuItem menuItemSortByTitle = new JMenuItem("Sort by title");
//		menuSort.add(menuItemSortByTitle);
//		
//		JMenuItem menuItemSortByCost = new JMenuItem("Sort by cost");
//		menuSort.add(menuItemSortByCost);
//		menu.add(menuSort);
		
		
		//Filler
		JMenu menuFilter = new JMenu("Fliter");
		JMenuItem menuItemShowAll = new JMenuItem("All");
		menuItemShowAll.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            showAll();
	        }
	    });
		menuFilter.add(menuItemShowAll);
		
		JMenuItem menuItemShowBook = new JMenuItem("Book");
		menuItemShowBook.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            showBook();
	        }
	    });
		menuFilter.add(menuItemShowBook);
		
		JMenuItem menuItemShowCD = new JMenuItem("CD");
		menuItemShowCD.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	showCD();
	        }
	    });
		menuFilter.add(menuItemShowCD);
		
		JMenuItem menuItemShowDVD= new JMenuItem("DVD");
		menuItemShowDVD.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	showDVD();
	        }
	    });
		menuFilter.add(menuItemShowDVD);
		
		menu.add(menuFilter);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(37, 11, 89, 23);
		menuBar.add(menu);
		panelBar.add(menuBar);
		
		// body
		panelBody = new JPanel();
		panelBody.setBounds(0, 46, 1064, 635);
		getContentPane().add(panelBody);
		panelBody.setLayout(new GridLayout(3, 3, 0, 0));
		
		showAll();
	}
	
	public static void showAll() {
		panelBody.setLayout(new GridLayout(3, 3, 0, 0));
		panelBody.removeAll();
		for(int i = 0; i < aims.lstProducts.size(); i++) {
			Product product = new Product(aims.lstProducts.get(i));
			panelBody.add(product);
		}
	}
	
	public void showBook() {
		panelBody.removeAll();
		for(int i = 0; i < aims.lstProducts.size(); i++) {
			Media media = aims.lstProducts.get(i);
			if(media.getId()==MediaId.Book) {
				panelBody.add(new Product(media));
			}
		}
	}
	
	public void showCD() {
		panelBody.removeAll();
		for(int i = 0; i < aims.lstProducts.size(); i++) {
			Media media = aims.lstProducts.get(i);
			if(media.getId()==MediaId.CompactDisc) {
				panelBody.add(new Product(media));
			}
		}
	}
	
	public void showDVD() {
		panelBody.removeAll();
		for(int i = 0; i < aims.lstProducts.size(); i++) {
			Media media = aims.lstProducts.get(i);
			if(media.getId()==MediaId.DVD) {
				panelBody.add(new Product(media));
			}
		}
	}
	
	public void showCart() {
		panelBody.removeAll();
		for(int i = 0; i < order.itemsOrdered.size(); i++) {
			Media media= order.itemsOrdered.get(i);
			panelBody.add(new Product(media, 1));
			
		}
	}
}
