package date;

import java.time.LocalDateTime;

public class DateUtils {
	public static int compareDate(MyDate date1, MyDate date2) {
		LocalDateTime ldt1 = LocalDateTime.of(date1.getYear(), date1.getMonth(), date1.getDay(), 0, 0, 0);
		LocalDateTime ldt2 = LocalDateTime.of(date2.getYear(), date2.getMonth(), date2.getDay(), 0, 0, 0);
		
		return ldt1.compareTo(ldt2);
	}
	
	public static void sort(MyDate[] myList, int length) {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(compareDate(myList[i], myList[j]) < 0) {
					MyDate temp = myList[i];
					myList[i] = myList[j];
					myList[j] = temp;
				}
			}
		}
		MyDate.print(myList, 4);
	}
}
