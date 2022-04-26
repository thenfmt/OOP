
public class TestPassingParameter {
	
	public static void main(String[] args) {
		DVD jungleDVD = new DVD("Jungle");
		DVD cinderellaDVD = new DVD("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("JungleDVD title: " + jungleDVD.getTitle());
		System.out.println("cinderellaDVD title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("JungleDVD title: " + jungleDVD.getTitle());
	}
	
	public static void swap(DVD o1, DVD o2) {
		DVD temp = o1;
		o1 = o2;
		o2 = temp;
	}
	
	public static void changeTitle(DVD dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DVD(oldTitle);
	}
	
}
