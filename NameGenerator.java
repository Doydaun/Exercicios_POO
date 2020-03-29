package Lista02;

	//Autor Tharcisio Pereira

public class NameGenerator {

	public static String generateStarWarsName(String[] entrada) {
		
		//divide a primeira posi��o por espa�os e guarda em parts[]
		String[] parts = entrada[0].split(" ");
		
		//manda para as posi��es de entrada as substrings passadas no par�metro
		String nomeStarWars = (parts[parts.length - 1].substring(0, 3) 
				+ entrada[0].substring(0, 2).toLowerCase() + " " 
				+ entrada[1].substring(0, 2)
				+ entrada[2].substring(0, 3).toLowerCase());

		System.out.println(nomeStarWars);
		
		return nomeStarWars;
	}
	
	//teste b�sico
	public static void main(String[] args) {
		
		String[] entrada = new String[3];
		entrada[0] = "Tharcisio Hernani Vitor Felipe Pereira";
		entrada[1] = "Graf";
		entrada[2] = "Gaspar";
				
		generateStarWarsName(entrada);			
		
	}
}
