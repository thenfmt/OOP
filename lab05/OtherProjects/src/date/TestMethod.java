package date;

public class TestMethod {
	public static void main(String[] args) {
		MyDate myList[] = new MyDate[10];
		
		myList[0] = new MyDate(15, 9, 1999);
		myList[1] = new MyDate(15, 9, 1999);
		myList[2] = new MyDate(14, 2, 1998);
		myList[3] = new MyDate(15, 2, 1998);
		myList[4] = new MyDate(27, 2, 1995);
		
		System.out.println("\n\nPrint format: ");
		myList[0].print(2);
		
		System.out.println("\n\nPrint list: ");
		MyDate.print(myList, 4);
		
		System.out.println("\n\nshow compare date: ");
		showCompare(myList, 0, 1);
		showCompare(myList, 2, 3);
		
		
		System.out.println("\n\nShow sort date: ");
		DateUtils.sort(myList, 4);
	}
	
	public static void showCompare(MyDate myList[], int x, int y) {
		System.out.print("Date 1 ");
		myList[x].print(1);
		System.out.print("Date 2 ");
		myList[y].print(1);
		
		System.out.println("Difference between two date is: " + DateUtils.compareDate(myList[x], myList[y]));	
	}
}
