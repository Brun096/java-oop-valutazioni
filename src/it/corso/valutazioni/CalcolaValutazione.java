package it.corso.valutazioni;

class CalcolaValutazione {

	int idStudente;
	int assenze;
	double mediaVoti;
	String studente;
	
	//calcolare le assenze e i voti
	
	CalcolaValutazione(int idStudente, int assenze, double mediaVoti ){
		
		this.idStudente=idStudente;
		this.assenze=assenze;
		this.mediaVoti=mediaVoti;
		
		
		if ((assenze>25 && assenze<50) && mediaVoti>2) {
			studente="Promosso";
		}else if(assenze<25 && mediaVoti>=2){
			studente="Promosso";
		}else{
			studente="Bocciato";
		}
	 System.out.println("Lo studente "+idStudente+" è: "+studente);
	}
}
