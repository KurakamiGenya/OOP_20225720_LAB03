package hust.soict.dsai.aims.media;

public class Track implements Playable {

    private String title; // Name of the track
    private int length; // Length of the track

    // Default constructor
    public Track() {

    }

    // Constructor with full arguments
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

}