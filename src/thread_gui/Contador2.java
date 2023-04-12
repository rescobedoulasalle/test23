package thread_gui;

import javax.swing.JTextArea;

public class Contador2 extends Thread {
	
	public JTextArea textA;
	
	public Contador2 (JTextArea jt) {
		
		this.textA = jt;
		
	}
	
	public void run() {
		
		
		for(int i =1; i<=1000; i++) {
			
			System.out.println(i);
			this.textA.setText( String.valueOf(i));
			try {
				sleep( (int) (Math.random()*2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
 		}
		
	}

}
