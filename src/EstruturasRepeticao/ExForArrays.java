package EstruturasRepeticao;

public class ExForArrays {

	public static void main(String[] args) {
		
		//O arrays come�am com �ndice igual a 0 (zero), 
		//iniciamos a nossa vari�vel x tamb�m com valor zero e validamos a quantidade de repeti��es, 
		//a partir da quantidade de elementos do array.
	
			String alunos[] = { "Samara", "Carla", "Roberto", "Pedro" };

//			for (int x=0; x<alunos.length; x++) {
//				System.out.println("O aluno no indice x=" + x + " � " + alunos[x]);
//			}
			
			//O uso do for / each est� fortemente relacionado, com um cen�rio onde contenha um array ou cole��o, e assim , 
			//a intera��o � baseada nos elementos da cole��o.

		
			
			//String aluno : alunos -> De forma abreviada, 
			//� criada uma vari�vel nome obtendo um elemento do vetor a cada ocorr�ncia;
			//A impress�o de cada aluno � realizada.
		for(String aluno : alunos) {
		  System.out.println(aluno);
		}

	}
}
