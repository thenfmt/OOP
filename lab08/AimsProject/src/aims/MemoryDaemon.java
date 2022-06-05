package aims;

public class MemoryDaemon implements Runnable{
	long memoryUsed;
	
	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;
		
		while(true) {
			used = rt.totalMemory() - rt.freeMemory();
			if(used != memoryUsed) {
				System.out.println("\nMemory used = " + used);
				memoryUsed = used;
			}
		}
	}

}
