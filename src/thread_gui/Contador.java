package thread_gui;

public class Contador extends Thread {
	
	public void run() {
		
		
		for(int i =1; i<=1000; i++) {
			
			System.out.println(i);
			
		}
		
	}

}
