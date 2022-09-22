package Exceptions;
/*
 * E quando inevitavelmente, ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?
A instrução try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado. 
A instrução catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try. 
A instrução finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares: 
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

	        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
	        System.out.println("Tenho " + idade + " anos ");
	        System.out.println("Minha altura é " + altura + "cm ");
		  }
		  
	        catch (InputMismatchException e) {
			System.err.println("Os campos altura e idade precisam ser numericos  e aceitamos somente pontos");
			}
}
}