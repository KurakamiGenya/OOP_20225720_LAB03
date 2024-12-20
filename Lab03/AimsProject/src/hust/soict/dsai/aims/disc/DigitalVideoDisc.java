package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {

	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;

	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc() {
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title) {
		this();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
