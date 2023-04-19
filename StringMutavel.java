package JAVA;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer so = new 	StringBuffer();
		StringBuilder s1 = new 	StringBuilder("juliano");
	
	
		System.out.println("A capacidade dessa String e "+ s1.capacity());
		// capacidade para armazenar x caracteres

		System.out.println("O tamanho desta String e "+ s1.length());
		//Quantos caracteres tal variavel possui
		System.out.println("Substituindo:"+ s1.replace(6, 6, "e"));
		//necessito saber quais intervalos eu irei substituir
		
		s1.append("Alessandro");
		//adicionando uma palavra para essa variavel		
		System.out.println(s1);
		System.out.println("Inversão dos caracteres:" + s1.reverse());
		StringBuilder url = new StringBuilder("WWW.XTI.COM.BR").delete(0, 4);
		//deletando um determinado numeros de caracteres
		System.out.println(url);
		
		
	}
}
