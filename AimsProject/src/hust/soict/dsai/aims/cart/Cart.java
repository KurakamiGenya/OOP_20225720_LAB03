package hust.soict.dsai.aims.cart;

import java.util.Collections;
//import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    // Maximum number of DVDs allowed in the cart
    public static final int MAX_NUMBERS_ORDERED = 20;

    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The item has been added to your cart.");
        } else {
            System.out.println("The item is already in your cart.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The item has been removed from your cart.");
        } else {
            System.out.println("The item is not in your cart to remove.");
        }
    }

    // Method to calculate the total cost of all DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("******************* CART *******************");
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty");
        } else {
            for (Media media : itemsOrdered) {
                System.out.println(media.toString());
            }
        }
        System.out.println("********************************************");
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Cart sorted by cost (descending) then title:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Cart sorted by title (alphabet) then cost:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
    }

    public Media findMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    public void filterById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with ID: " + id);
        }
    }

    public void filterByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with title: " + title);
        }
    }

    public void clearCart() {
        itemsOrdered.clear();
    }

    public ObservableList<Media> getItemsOrdered() {
        return this.itemsOrdered;
    }

    // Method to display the current cart status
    /*
     * public void displayCart() {
     * System.out.println("Cart contains " + qtyOrdered + " items:");
     * for (DigitalVideoDisc disc : itemsOrdered) {
     * System.out.println(disc);
     * }
     * System.out.println("Total cost: " + totalCost());
     * }
     */

    /*
     * public void displayCart() {
     * System.out.println("***********************CART***********************");
     * System.out.println("Ordered Items:");
     * int index = 1;
     * for (Media media : itemsOrdered) {
     * System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
     * index++,
     * media.getTitle(),
     * media.getCategory(),
     * media.getDirector(),
     * media.getLength(),
     * media.getCost());
     * }
     * System.out.printf("Total cost: %.2f\n", totalCost());
     * System.out.println("****************************************************");
     * }
     */

    /*
     * public void findDVDById(int id) {
     * boolean found = false;
     * for (Media disc : itemsOrdered) {
     * if (disc.getId() == id) {
     * System.out.println("DVD found:");
     * System.out.
     * printf("ID: %d - Title: %s - Category: %s - Director: %s - Length: %d - Price: %.2f $\n"
     * ,
     * disc.getId(),
     * disc.getTitle(),
     * disc.getCategory(),
     * disc.getDirector(),
     * disc.getLength(),
     * disc.getCost());
     * found = true;
     * break;
     * }
     * }
     * if (!found) {
     * System.out.println("No DVD found with ID: " + id);
     * }
     * }
     * 
     * public void findDVDByTitle(String keywords) {
     * String[] keywordArray = keywords.toLowerCase().split("\\s+"); // Convert the
     * string of keywords into an array of
     * // separate words, and split them with space
     * // characters
     * boolean found = false;
     * 
     * System.out.println("Search results for keywords: \"" + keywords + "\":");
     * for (Media disc : itemsOrdered) {
     * String titleLower = disc.getTitle().toLowerCase(); // Convert the title to
     * lowercase
     * for (String keyword : keywordArray) {
     * if (titleLower.contains(keyword)) {
     * System.out.
     * printf("ID: %d - Title: %s - Category: %s - Director: %s - Length: %d - Price: %.2f $\n"
     * ,
     * disc.getId(),
     * disc.getTitle(),
     * disc.getCategory(),
     * disc.getDirector(),
     * disc.getLength(),
     * disc.getCost());
     * found = true;
     * break; // Stop checking with other keywords if one has been matched
     * }
     * }
     * }
     * if (!found) {
     * System.out.println("No DVD found matching the keywords: \"" + keywords +
     * "\"");
     * }
     * }
     */

}
