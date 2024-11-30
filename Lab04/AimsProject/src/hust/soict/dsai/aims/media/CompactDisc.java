package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Default constructor
    public CompactDisc() {
        super(); // Call the default constructor of Disc
    }

    // Constructor with basic arguments (length is not set here)
    public CompactDisc(String title, String category, String director, float cost, String artist) {
        super(0, title, category, cost, 0, director); // Set length to 0 temporarily
        this.artist = artist;
    }

    // Method addTrack
    public void addTrack(Track track) {
        if (tracks.contains(track)) { // Check if the track is already in the list
            System.out.println("The track \"" + track.getTitle() + "\" is already in the list.");
        } else {
            tracks.add(track); // Add the track to the list
            System.out.println("Track \"" + track.getTitle() + "\" has been added.");
        }
    }

    // Method removeTrack
    public void removeTrack(Track track) {
        if (tracks.contains(track)) { // Check if the track exists in the list
            tracks.remove(track); // Delete the track from the list
            System.out.println("Track \"" + track.getTitle() + "\" has been removed.");
        } else {
            System.out.println("The track \"" + track.getTitle() + "\" is not in the list.");
        }
    }

    // Override method getLength: Calculate the sum of length of all tracks
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Setter for artist (if needed)
    public void setArtist(String artist) {
        this.artist = artist;
    }
}