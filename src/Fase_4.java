import java.util.ArrayList;


public class Fase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> llista =new ArrayList<>();
		llista.add('S');
		llista.add('A');
		llista.add('R');
		llista.add('A');
		
		ArrayList<Character> llista2 =new ArrayList<>();
		llista2.add('M');
		llista2.add('O');
		llista2.add('N');
		llista2.add('T');
		llista2.add('A');
		llista2.add('G');
		llista2.add('U');
		llista2.add('T');
		
		ArrayList<Character> llistaFullName = new ArrayList<Character>();
		
		
		llistaFullName.addAll(llista);
		llistaFullName.add(' ');
		llistaFullName.addAll(llista2);
		
		System.out.println(llistaFullName);
		
	}
	
	

}

/*
− Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
− Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. 
És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
*/