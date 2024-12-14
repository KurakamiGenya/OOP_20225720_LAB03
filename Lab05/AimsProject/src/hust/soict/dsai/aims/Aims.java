package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class Aims {

	public Aims() {
		// TODO Auto-generated constructor stub
	}

	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
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

		/*
		 * Cart cart = new Cart();
		 * 
		 * Media media1 = new Media() {
		 * {
		 * setId(1);
		 * setTitle("The Matrix");
		 * setCategory("Sci-Fi");
		 * setCost(15.99f);
		 * }
		 * };
		 * Media media2 = new Media() {
		 * {
		 * setId(2);
		 * setTitle("Avengers");
		 * setCategory("Action");
		 * setCost(20.99f);
		 * }
		 * };
		 * Media media3 = new Media() {
		 * {
		 * setId(3);
		 * setTitle("The Matrix");
		 * setCategory("Sci-Fi");
		 * setCost(10.99f);
		 * }
		 * };
		 * 
		 * cart.addMedia(media1);
		 * cart.addMedia(media2);
		 * cart.addMedia(media3);
		 * 
		 * cart.printCart();
		 * 
		 * cart.sortByCostTitle();
		 * cart.sortByTitleCost();
		 */

		Store store = new Store();
		Cart cart = new Cart();
		Scanner scanner = new Scanner(System.in);

		boolean running = true;
		while (running) {
			showMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
				case 1: // View store
					boolean viewingStore = true;
					while (viewingStore) {
						storeMenu();
						int storeChoice = scanner.nextInt();
						scanner.nextLine(); // Consume newline

						switch (storeChoice) {
							case 1: // See a media's details
								System.out.print("Enter the title of media: ");
								String title = scanner.nextLine();
								Media media = store.findMediaByTitle(title);
								if (media != null) {
									System.out.println(media.toString());
									mediaDetailsMenu();
									int mediaChoice = scanner.nextInt();
									scanner.nextLine(); // Consume newline

									switch (mediaChoice) {
										case 1: // Add to cart
											cart.addMedia(media);
											System.out.println("Media added to cart");
											break;
										case 2: // Play
											if (media instanceof Playable) {
												((Playable) media).play();
											} else {
												System.out.println("This media cannot be played");
											}
											break;
										case 0: // Back
											break;
									}
								} else {
									System.out.println("Media not found");
								}
								break;
							case 2: // Add a media to cart
								System.out.print("Enter the title of media: ");
								title = scanner.nextLine();
								media = store.findMediaByTitle(title);
								if (media != null) {
									cart.addMedia(media);
									System.out.println("Media added to cart");
								} else {
									System.out.println("Media not found");
								}
								break;
							case 3: // Play a media
								System.out.print("Enter the title of media: ");
								title = scanner.nextLine();
								media = store.findMediaByTitle(title);
								if (media != null && media instanceof Playable) {
									((Playable) media).play();
								} else {
									System.out.println("Media not found or cannot be played");
								}
								break;
							case 4: // See current cart
								cart.printCart();
								break;
							case 0: // Back
								break;
						}
					}
					break;
				case 2: // Update store
					System.out.println("1. Add media");
					System.out.println("2. Remove media");
					int updateChoice = scanner.nextInt();
					scanner.nextLine(); // Consume newline

					if (updateChoice == 1) {
						System.out.println("Enter media details (title, category, cost):");
						String title = scanner.nextLine();
						String category = scanner.nextLine();
						float cost = scanner.nextFloat();
						scanner.nextLine(); // Consume newline

						Media newMedia = new Media() {
							{
								setTitle(title);
								setCategory(category);
								setCost(cost);
							}
						};
						store.addMedia(newMedia);
					} else if (updateChoice == 2) {
						System.out.print("Enter the title of the media to remove: ");
						String title = scanner.nextLine();
						Media media = store.findMediaByTitle(title);
						if (media != null) {
							store.removeMedia(media);
						} else {
							System.out.println("Media not found");
						}
					}
					break;
				case 3: // See current cart
					boolean viewingCart = true;
					while (viewingCart) {
						cart.printCart();
						cartMenu();
						int cartChoice = scanner.nextInt();
						scanner.nextLine(); // Consume newline

						switch (cartChoice) {
							case 1: // Filter medias in cart
								System.out.println("Filter by: 1. ID - 2. Title");
								int filterChoice = scanner.nextInt();
								scanner.nextLine(); // Consume newline
								if (filterChoice == 1) {
									System.out.print("Enter ID: ");
									int id = scanner.nextInt();
									scanner.nextLine();
									cart.filterById(id);
								} else if (filterChoice == 2) {
									System.out.print("Enter title: ");
									String title = scanner.nextLine();
									cart.filterByTitle(title);
								}
								break;
							case 2: // Sort medias in cart
								System.out.println("Sort by: 1. Title - 2. Cost");
								int sortChoice = scanner.nextInt();
								scanner.nextLine(); // Consume newline
								if (sortChoice == 1) {
									cart.sortByTitleCost();
								} else if (sortChoice == 2) {
									cart.sortByCostTitle();
								}
								break;
							case 3: // Remove media from cart
								System.out.print("Enter the title of the media to remove: ");
								String title = scanner.nextLine();
								Media media = cart.findMediaByTitle(title);
								if (media != null) {
									cart.removeMedia(media);
									System.out.println("Media removed from cart");
								} else {
									System.out.println("Media not found in cart");
								}
								break;
							case 4: // Play a media
								System.out.print("Enter the title of the media: ");
								title = scanner.nextLine();
								media = cart.findMediaByTitle(title);
								if (media != null && media instanceof Playable) {
									((Playable) media).play();
								} else {
									System.out.println("Media not found or cannot be played");
								}
								break;
							case 5: // Place order
								System.out.println("Order placed. Cart is now empty");
								cart.clearCart();
								break;
							case 0: // Back
								viewingCart = false;
								break;
						}
					}
					break;
				case 0: // Exit
					running = false;
					break;
			}
		}

		scanner.close();
	}

}
