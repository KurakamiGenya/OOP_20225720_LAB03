package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.media.Track;

import java.util.ArrayList;

public class CompactDisc extends Disc {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Default constructor
    public CompactDisc() {
        super(); // Call the default constructor of Disc
    }

    // Constructor with basic arguments
    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(0, title, category, cost, length, director); // Gọi constructor của Disc
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

    // Method getLength: Tính tổng độ dài của tất cả các track
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

    // Setter for artist (nếu cần)
    public void setArtist(String artist) {
        this.artist = artist;
    }
}