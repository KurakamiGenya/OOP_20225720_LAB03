package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

public class Aims {

	public Aims() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * Cart anOrder = new Cart();
		 * 
		 * DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
		 * "Roger Allers", 87, 19.95f);
		 * // anOrder.addDigitalVideoDisc(dvd1);
		 * DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
		 * "George Lucas", 87, 24.95f);
		 * // anOrder.addDigitalVideoDisc(dvd2);
		 * DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		 * // anOrder.addDigitalVideoDisc(dvd3);
		 * 
		 * System.out.println("Total Cost is: ");
		 * System.out.println(anOrder.totalCost());
		 * 
		 * // Display the cart before removal
		 * System.out.println("\n--- Cart before removing a disc ---");
		 * // anOrder.displayCart();
		 * 
		 * // Test removing an existing DVD (Star Wars)
		 * System.out.println("\nTrying to remove 'Star Wars'...");
		 * // anOrder.removeDigitalVideoDisc(dvd2);
		 * 
		 * // Display the cart after removing the DVD
		 * System.out.println("\n--- Cart after removing 'Star Wars' ---");
		 * // anOrder.displayCart();
		 * 
		 * // Test removing a non-existent DVD (should display a message)
		 * System.out.println("\nTrying to remove 'Star Wars' again...");
		 * // anOrder.removeDigitalVideoDisc(dvd2);
		 */

		/*
		 * List<Media> mediae = new ArrayList<Media>();
		 * 
		 * CompactDisc cd = new CompactDisc("LK Nhac tre", "Pop", "VA", (float) 8.50,
		 * "VA");
		 * DigitalVideoDisc dvd = new DigitalVideoDisc("The gioi dong vat");
		 * Book book = new Book(0, "Dac Nhan Tam", "Self-help", (float) 11.75);
		 * 
		 * mediae.add(cd);
		 * mediae.add(dvd);
		 * mediae.add(book);
		 * 
		 * for (Media m : mediae) {
		 * System.out.println(m.toString());
		 * }
		 */

		Cart cart = new Cart();

		Media media1 = new Media() {
			{
				setId(1);
				setTitle("The Matrix");
				setCategory("Sci-Fi");
				setCost(15.99f);
			}
		};
		Media media2 = new Media() {
			{
				setId(2);
				setTitle("Avengers");
				setCategory("Action");
				setCost(20.99f);
			}
		};
		Media media3 = new Media() {
			{
				setId(3);
				setTitle("The Matrix");
				setCategory("Sci-Fi");
				setCost(10.99f);
			}
		};

		cart.addMedia(media1);
		cart.addMedia(media2);
		cart.addMedia(media3);

		cart.printCart();

		cart.sortByCostTitle();
		cart.sortByTitleCost();
	}

}
