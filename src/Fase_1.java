public class Fase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char [] [] nom = new char [1][4];
		
			nom [0][0]='S';
			nom [0][1]='A';
			nom [0][2]='R';
			nom [0][3]='A';
			
			for (int i=0; i<nom.length; i++) { //el  primer bucle for recorre la primera dimensió (array amb 1 posicio) FILES
				
				for(int j=0; j<nom[0].length; j++) { //el  segon bucle for recorre la segonaa dimensió (array amb 4 posicions) COLUMNES
					
					System.out.println(nom[i][j]);
				}
								
			}
			/* També es pot executar de la següent manera:
			
			System.out.println("El meu nom és: ");
			System.out.println();
			System.out.println(nom [0][0]);
			System.out.println(nom [0][1]);
			System.out.println(nom [0][2]);
			System.out.println(nom [0][3]);
			*/
	}

}


/*
- Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
− Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
 */