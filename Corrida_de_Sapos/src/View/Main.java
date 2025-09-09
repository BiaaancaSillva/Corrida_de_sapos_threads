package View;

import Controller.ThreadSapos;
public class Main {
	public static void main (String args []) {
		int vet [] = new int [5];
		int i = 0;
		
		for (i = 1; i <= 5; i++) {
			ThreadSapos t = new ThreadSapos (i);
			t.start();
		}
		
		
	}
}
