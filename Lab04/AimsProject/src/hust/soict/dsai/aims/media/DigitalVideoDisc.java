package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {

	private static int nbDigitalVideoDiscs = 0;

	// Default constructor
	public DigitalVideoDisc() {
		super(); // Call the default constructor of Disc
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs); // Assign the ID
	}

	// Constructor with title
	public DigitalVideoDisc(String title) {
		this(); // Call the default constructor
		this.setTitle(title);
	}

	// Constructor with title, category & cost
	public DigitalVideoDisc(String title, String category, float cost) {
		this();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}

	// Constructor with title, category, director & cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.setDirector(director); // Use setter from Disc
	}

	// Constructor with all properties
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.setDirector(director);
		this.setLength(length); // Use setter from Disc
	}
}