package hust.soict.dsai.aims.cart;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Media media1, Media media2) {
		int titleComparison = media1.getTitle().compareToIgnoreCase(media2.getTitle());
		if (titleComparison != 0) {
			return titleComparison;
		}
		return Float.compare(media2.getCost(), media1.getCost());
	}

}
