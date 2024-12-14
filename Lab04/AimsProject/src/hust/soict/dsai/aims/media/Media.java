package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.aims.cart.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.cart.MediaComparatorByTitleCost;

public abstract class Media {

	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

	private int id;
	private String title;
	private String category;
	private float cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media() {
		// Default constructor
	}

	public boolean equals(Media media) {
		// Check if media is null
		if (media == null) {
			return false;
		}

		// Compare the id & title attributes
		return this.id == media.getId() && this.title != null && this.title.equals(media.getTitle());
	}

	@Override
	public int hashCode() {
		// Ensure the consistency between equals() & hashCode()
		return title != null ? title.hashCode() : 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ID: ")
				.append(this.getId())
				.append(" - Title: ")
				.append(this.getTitle())
				.append(" - Category: ")
				.append(this.getCategory());

		return sb.toString();
	}

}
