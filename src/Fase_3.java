import java.util.*;


public class Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> nomPersona = new HashMap<String,Integer>();
		
		 nomPersona.put("S", 1);
		 nomPersona.put("A", 1);
		 nomPersona.put("R", 1);
		 nomPersona.put("A", 2);
		
		 	//System.out.println(nomPersona);
		 	
		 	for (String K : nomPersona.keySet()) {
		      System.out.println("Lletra: " + K + " Vegades: " + nomPersona.get(K));
		    }
		 	
	}
}		

//− Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.


		//NOTES: 
		//nomPersona.get() --> Accedir a  un valor de la llista, fent referencia a la clau
		//nomPersona.remove("1") --> Per eliminar un objecte emmagatzemat dins del mapa.
		//System.out.println(nomPersona);
		// Si s'afegeix un element amb el mateix nom de la clau "2", aquest substituira a l'anterior denominat "2" 
		//nomPersona.put("2", new Nom ("S"));
		//System.out.println(nomPersona);
	
