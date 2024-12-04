package hust.soict.dsai.aims.media;

public abstract class Media {

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
}
