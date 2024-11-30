package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();

	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) { // Check if authorName is not in the author list yet
			authors.add(authorName); // Add authorName to the list
		} else {
			System.out.println("Author already exists: " + authorName);
		}
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) { // Check if authorName is in the author list
			authors.remove(authorName); // Delete authorName from the list
		} else {
			System.out.println("Author not found: " + authorName);
		}
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

}
