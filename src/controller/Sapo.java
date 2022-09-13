package controller;

public class Sapo extends Thread {
	
	public static int posicao = 1;
	
	public Sapo() {
	}
	
	@Override
	public void run() {
		setup();
		System.out.println("#"+getId()+" "+posicao+"° lugar");
		posicao++;
	}
	
	private void setup() {
		int chegada = 100;
		int localParada = 0;
		
		while(chegada > localParada) {
			int pulo = (int)(Math.random() * 10);
			
			System.out.println("sapo #"+getId()+" - pulou: "+pulo+" metros");
			
			localParada += pulo;
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
