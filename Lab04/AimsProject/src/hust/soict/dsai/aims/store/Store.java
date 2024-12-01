package hust.soict.dsai.aims.store;

import java.util.ArrayList;

// import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
    // Attribute: ArrayList to store items available in the store
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The item \"" + media.getTitle() + "\" has been added to the store.");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("The item \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The item \"" + media.getTitle() + "\" is not found in the store.");
        }
    }

    // Method to display the list of DVDs in the store
    /*
     * public void displayStore() {
     * System.out.println("***********************STORE***********************");
     * if (itemsInStore.isEmpty()) {
     * System.out.println("The store is currently empty.");
     * } else {
     * System.out.println("Available DVDs in the store:");
     * for (int i = 0; i < itemsInStore.size(); i++) {
     * DigitalVideoDisc dvd = itemsInStore.get(i);
     * System.out.
     * printf("%d. Title: %s - Category: %s - Director: %s - Length: %d - Price: %.2f $\n"
     * ,
     * i + 1,
     * dvd.getTitle(),
     * dvd.getCategory(),
     * dvd.getDirector(),
     * dvd.getLength(),
     * dvd.getCost());
     * }
     * }
     * System.out.println("**************************************************");
     * }
     */
}
