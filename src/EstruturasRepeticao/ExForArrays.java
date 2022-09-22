package EstruturasRepeticao;

public class ExForArrays {

	public static void main(String[] args) {
		
		//O arrays começam com índice igual a 0 (zero), 
		//iniciamos a nossa variável x também com valor zero e validamos a quantidade de repetições, 
		//a partir da quantidade de elementos do array.
	
			String alunos[] = { "Samara", "Carla", "Roberto", "Pedro" };

//			for (int x=0; x<alunos.length; x++) {
//				System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
//			}
			
			//O uso do for / each está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim , 
			//a interação é baseada nos elementos da coleção.

		
			
			//String aluno : alunos -> De forma abreviada, 
			//é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
			//A impressão de cada aluno é realizada.
		for(String aluno : alunos) {
		  System.out.println(aluno);
		}

	}
}
