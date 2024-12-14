package hust.soict.dsai.aims.cart;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Media media1, Media media2) {
		int costComparison = Float.compare(media2.getCost(), media1.getCost());
		if (costComparison != 0) {
			return costComparison;
		}
		return media1.getTitle().compareToIgnoreCase(media2.getTitle());
	}

}
