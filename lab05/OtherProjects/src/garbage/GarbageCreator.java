package garbage;

import java.util.Random;

public class GarbageCreator {
public static void main(String[] args) {
		
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for(int i = 0; i < 65536999; i++) //increase number of loops
			s += r.nextInt(2);
		
		System.out.println(System.currentTimeMillis() - start);
	}
}
