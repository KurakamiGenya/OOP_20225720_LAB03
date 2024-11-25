
public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		ObjectWrapper jungleWrapper = new ObjectWrapper(jungleDVD);
		ObjectWrapper cinderellaWrapper = new ObjectWrapper(cinderellaDVD);

		swap(jungleWrapper, cinderellaWrapper);

		jungleDVD = (DigitalVideoDisc) jungleWrapper.object;
		cinderellaDVD = (DigitalVideoDisc) cinderellaWrapper.object;

		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	// deprecated

	/*
	 * public static void swap(Object o1, Object o2) {
	 * Object tmp = o1;
	 * o1 = o2;
	 * o2 = tmp;
	 * }
	 */

	public static void swap(ObjectWrapper o1, ObjectWrapper o2) {
		Object tmp = o1.object;
		o1.object = o2.object;
		o2.object = tmp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
