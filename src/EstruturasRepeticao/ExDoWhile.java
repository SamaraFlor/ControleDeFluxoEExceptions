package EstruturasRepeticao;
/*
 * O la�o do / while (na tradu��o literal para a l�ngua portuguesa �fa�a�enquanto�), 
 * assim como o la�o while, considera que, enquanto uma determinada condi��o for v�lida, 
 * o bloco de c�digo ser� executado. Entretanto, do / while testa a condi��o ap�s executar o c�digo, 
 * sendo assim, mesmo que a condi��o seja considerada inv�lida, 
 * no primeiro teste o bloco ser� executado pelo menos uma vez.
 */

import java.util.Random;

public class ExDoWhile {

	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes at� algu�m atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Al� !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
