package EstruturasRepeticao;
/*
 * O la�o while (na tradu��o literal para a l�ngua portuguesa �enquanto�) 
 * determina que, enquanto uma condi��o for v�lida, o bloco de c�digo ser� executado. 
 * O la�o while, testa a condi��o antes de executar o c�digo, 
 * logo, caso a condi��o seja inv�lida no primeiro teste o bloco nem ser� executado.
 */

import java.util.concurrent.ThreadLocalRandom;

public class ExWhile {
	
	public static void main(String[] args) {
		double mesada = 50.0;
	        while(mesada>0) {
	            Double valorDoce = valorAleatorio();
	            
	            //usado para que o valor n�o fique negativo
	            if(valorDoce > mesada)
	                valorDoce = mesada;

	            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
	            mesada = mesada - valorDoce;
	        }
	        System.out.println("Mesada:" + mesada);
	        System.out.println("Jo�ozinho gastou toda a sua mesada em doces");
	        
	      
	   }
	   private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	   }
}
