package thread_gui;

public class Simulacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		c1.start();c2.start();c3.start();

	}

}
