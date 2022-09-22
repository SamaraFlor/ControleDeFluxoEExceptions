import java.util.Scanner;

public class ResultadoEscolar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
	 
	 System.out.println("Digite a nota");
	 int nota = entrada.nextInt();
	 //A Estrutura Condicional Composta segue o mesmo princípio da Estrutura Condicional Simples,
	 //com a diferença de que quando a condição não é satisfeita, será executado o outro comando. 
	 //O comando que define a estrutura é representado pelas palavras SE e SE NÃO.
	
		if (nota >= 7)
			System.out.println("Aprovado");
		//Em um controle de fluxo condicional, nem sempre nos limitamos ao se 
		//(if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições
		else if (nota >= 5 && nota < 7)
			System.out.println("Recuperação");
		else
			System.out.println("Reprovado");
	    }
	}

