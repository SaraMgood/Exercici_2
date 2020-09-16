import java.util.ArrayList;
import java.util.Iterator;
public class Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<Character> llista =new ArrayList<>();
			llista.add('S');
			llista.add('A');
			llista.add('R');
			llista.add('A');
			
			
			Iterator<Character> it= llista.iterator();
				char lletra;
				while (it.hasNext()) {
				lletra = it.next();
					
				System.out.println(lletra);
					if ((lletra=='A')||(lletra=='E')||(lletra=='I')||(lletra=='O')||(lletra=='U')) {
						System.out.println("VOCAL");
					}
					else if ((lletra=='0')||(lletra=='1')||(lletra=='2')||(lletra=='3')||(lletra=='4')|| (lletra=='5')||(lletra=='6')||(lletra=='7')||(lletra=='8')||(lletra=='9')){
						
					System.out.println("Els noms de persones no contenen números!");
					}
					else {
						System.out.println("CONSONANT");
					}
				}
							
	}


}


/*
− Canvia la taula per una llista (List<Character>)
− Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
− Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.*/

	
	
	
			   
				



		

	
