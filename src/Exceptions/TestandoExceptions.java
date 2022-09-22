package Exceptions;
/*
 * E quando inevitavelmente, ocorrer uma exce��o? Como n�s desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?
A instru��o try, permite que voc� defina um bloco de c�digo, para ser testado quanto a erros enquanto est� sendo executado. 
A instru��o catch, permite definir um bloco de c�digo a ser executado, caso ocorra um erro no bloco try. 
A instru��o finally, permite definir um bloco de c�digo a ser executado, independente de ocorrer um erro ou n�o. As palavras-chave try e catch vem em pares: 
Estrutura de um bloco com try e catch:
 */

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TestandoExceptions {
	  public static void main(String[] args) {
	     
		  try {
			
	        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	        
	        System.out.println("Digite seu nome");
	        String nome = scanner.next();
	        
	        System.out.println("Digite seu sobrenome");
	        String sobrenome = scanner.next();

	        System.out.println("Digite sua idade");
	        int idade = scanner.nextInt();
	        
	        System.out.println("Digite sua altura");
	        double altura = scanner.nextDouble();

	        System.out.println("Ol�, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
	        System.out.println("Tenho " + idade + " anos ");
	        System.out.println("Minha altura � " + altura + "cm ");
		  }
		  
	        catch (InputMismatchException e) {
			System.err.println("Os campos altura e idade precisam ser numericos  e aceitamos somente pontos");
			}
}
}