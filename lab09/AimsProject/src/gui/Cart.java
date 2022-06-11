package gui;

import javax.swing.JPanel;
import java.awt.GridLayout;

public class Cart extends JPanel {

	/**
	 * Create the panel.
	 */
	public Cart() {
		setLayout(new GridLayout(3, 3, 0, 0));
		
		for(int i = 0; i < Frame.order.itemsOrdered.size(); i++) {
			Product product = new Product(Frame.order.itemsOrdered.get(i));
			this.add(product);
		}
	}

}
