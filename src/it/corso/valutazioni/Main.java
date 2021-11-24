package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r=new Random();
		
		int alunni=20;
		
		CalcolaValutazione[] voto=new CalcolaValutazione[alunni];
		
		for(int i=0; i< voto.length; i++) {
			int rAssenze=r.nextInt(101);
			int voti=r.nextInt(5);
			double rVoti=r.nextDouble()+voti;
			
			voto[i]=new CalcolaValutazione(i, rAssenze, rVoti);
		}
	}

}
