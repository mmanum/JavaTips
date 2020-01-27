package ArrayListStream;



import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
	
		int[] numeros = new int[]{1,2,3,4,5};
		for( int i=0;i<numeros.length;i++) {			
			System.out.println(numeros[i]);
		}

		System.out.println("Lenght: " + numeros.length);

		// ***************************************** 

		ArrayList<Integer> numerosAL = new ArrayList<Integer>();
		numerosAL.add(1);
		numerosAL.add(2);
		numerosAL.add(3);
		numerosAL.add(4);
		numerosAL.add(5);    
    
		for( int i=0;i<numerosAL.size();i++) {      
			System.out.println(numerosAL.get(i));
		}
		System.out.println("Size: " + numerosAL.size());

		// ***************************************** 

		ArrayList<String> textos=new ArrayList<String>();
		textos.add("hola");
		textos.add("que");
		textos.add("tal");
		textos.add("estas");
		textos.add("hola");
		textos.add("hola");
		
		int contador=0;		
		for(String texto:textos) {
		  if (texto.equals("hola")) 
			contador++;		  
		}
		System.out.println("Repeticiones de \"hola\": " + contador);

		// ***************************************** 
		System.out.println(textos.stream().filter(t->t.equals("hola")).count());
		
		// *****************************************     
		System.out.println(Collections.frequency(textos,"hola"));
	}
}