package hust.soict.dsai.aims.media;

public class Disc extends Media {

    private int length;
    private String director;

    // Default constructor
    public Disc() {
        super();
    }

    // Constructor with arguments for both inherited properties and this class' own
    // ones
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(); // Call the default constructor of Media
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.length = length;
        this.director = director;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for director
    public String getDirector() {
        return director;
    }

    // Setter for director
    public void setDirector(String director) {
        this.director = director;
    }
}