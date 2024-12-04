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

    // Override equals with argument of type Track
    public boolean equals(Track track) {
        // Check if the track is null
        if (track == null) {
            return false;
        }

        // Compare the attributes title & length
        return this.title != null && this.title.equals(track.getTitle()) && this.length == track.getLength();
    }

    @Override
    public int hashCode() {
        // Đảm bảo consistency giữa equals() và hashCode()
        int result = (title != null) ? title.hashCode() : 0;
        result = 31 * result + length;
        return result;
    }
}