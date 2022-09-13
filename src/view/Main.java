package view;

import controller.Sapo;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Corrida de Cem Metros");
		
		for(int i = 0; i < 5; i++) {
			Sapo s = new Sapo();
			s.start();
		}
	}

}
