package JAVA;

public class StringOperacoes {

	public static void main(String[] args) {
		/*
		 * STRING: MANIPULAÇÃO DE TEXTO
		 * 1)CONSTRUÇÃO;
		 * 
		 * 2)LOCALIZAÇÃO
		 * 
		 * 3)COMPARAÇÃO
		 * 
		 * 4)EXTRAÇÃO
		 * 
		 * 5) MODIFICAÇÃO
		 *  
		 */
		
		//========CONSTRUTORES DE CLASSE ======================
	
		String s1 = "Write_Once";
		String s2 = s1 + "Run AnyWhere";
		String s3 = new String("java");
		char[] array = {'j','u','l','i','a','n','o'};
		String s4 = new String(array);
		
		
		//=================================================
		
		//=======================OPERAÇÕES BASICAS COM STRING=====================
		int tamanho = s1.length();//descobrir  a quantidade de caracrteres
		
		char letra = s1.charAt(2); // retornar o indice que eu quero a partir da posicao
		
		s1.toString();// retorna a propria String
		//=================================================================
		
		//==================LOCALIZAÇÃO========================
		int posicao = s3.indexOf('j');// retornar a posição que está essa letra,o indice
		System.out.println("A posicao inicial da letra e:" +posicao);
		
		int posicao2 = s3.lastIndexOf('a'); // retornar a posição final
		
		 System.out.println("A ultima posicao ocupada pela letra:" +posicao2);
		 
		 boolean vazia = s3.isEmpty();
		 
		 System.out.println("A string está vazia ? " + vazia);
		 
		 //=====================================================
		 
		 //=============COMPARAÇÃO_STRING===========================
		 String xti = "XTI";
		/*boolean x =  xti.equals("xti");// operador de comparação para comparar os valores da String
		System.out.println(x)
		*/;
		boolean x =  xti.equalsIgnoreCase("xti");
		System.out.println(x);
		//compara se XTI e igual a xti independente de ser maiusculo ou minusculo o conteudo tem que ser igual
	
		boolean X= xti.startsWith("XT");
		System.out.println(x);
		// verifica se a String começa com XT
		boolean T = xti.endsWith("TI");
		//Verifica se a String termina com TI
		System.out.println(T);
		int c = "amor".compareTo("bola"); // -1(menor do que bola)
		int v = "bola".compareTo("amor");// 1 bola  vem depois logo maior
		// verifica se a String comparada é maior ou menor do que o valor comparado
		System.out.println(c);
		System.out.println(v);
		String so = "Olhe, olhe!";
		boolean g = so.regionMatches(true,6, "Olhe", 0, 4);//ignora letra maisucula
		System.out.println(g);
		
		//=============EXTRAÇÃODADOS======================================
		String um = "O brasil é lindo";
		String dois = um.substring(11); // a paritir da 11 String eu quero trazer todas as Strings
		System.out.println(dois);
		String QUATRO = um.substring(2,8);
		System.out.println(QUATRO);
		
		//============MODIFICADORES_STRING================================================
		String cinco = um.concat(" que maravilha" );
		System.out.println(cinco);
		String SEIS = um.replace('s','z');
		System.out.println(SEIS);
		String sete  = um.replaceFirst("","X");
		System.out.println(sete);
		String oito = um.replaceAll(" ","X");
		System.out.println(oito);
		String nove = um.toLowerCase();
		System.out.println(nove);
		String deis = um.toLowerCase();
		System.out.println(deis);
		System.out.println("         espaco               ".trim());
		//=====================================================================
		
				
		
	}

}
