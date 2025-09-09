package Controller;

public class ThreadSapos extends Thread {
	int vetPodio [] = new int [5];  
	int nmr, dpercorrida, i;
	public ThreadSapos (int nmr) {
		this.nmr = nmr;
	}
	
	public void  run () {
		salto ();
	}
	
	public void salto () {
		int chegada = 50;
		int pulo, distancia, dpercorrida;
		for (dpercorrida = 0; dpercorrida < chegada; ) {
			pulo = (int)((Math.random()*4)+0);;
			distancia = pulo * 2;
			dpercorrida += distancia;
			if (dpercorrida >= 50) {
				vetPodio [i] = nmr;
				i += 1;
			}
			System.out.println ("Sapo número - " +nmr +" saltou: " +pulo +" metros e percorreu mais " +distancia +" metros" +" | total " +dpercorrida +" metros|");			
		}
		
		
	}
}
