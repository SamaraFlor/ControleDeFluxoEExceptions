import java.util.Scanner;

public class ResultadoEscolar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
	 
	 System.out.println("Digite a nota");
	 int nota = entrada.nextInt();
	 //A Estrutura Condicional Composta segue o mesmo princ�pio da Estrutura Condicional Simples,
	 //com a diferen�a de que quando a condi��o n�o � satisfeita, ser� executado o outro comando. 
	 //O comando que define a estrutura � representado pelas palavras SE e SE N�O.
	
		if (nota >= 7)
			System.out.println("Aprovado");
		//Em um controle de fluxo condicional, nem sempre nos limitamos ao se 
		//(if) e sen�o (else), poderemos ter uma terceira, quarta e ou in�meras condi��es
		else if (nota >= 5 && nota < 7)
			System.out.println("Recupera��o");
		else
			System.out.println("Reprovado");
	    }
	}

