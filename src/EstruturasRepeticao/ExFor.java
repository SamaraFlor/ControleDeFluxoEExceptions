package EstruturasRepeticao;

/*
 * O comando for (na tradução literal para a língua portuguesa “para”) 
 * permite que uma variável contadora, seja testada e incrementada a cada iteração, 
 * sendo essas informações definidas na chamada do comando. 
 * O comando for recebe como entrada uma variável contadora, 
 * a condição para continuar a execução e o valor de incrementação.
 */
public class ExFor {

	public static void main(String[] args) {
	
   
		//Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:
			for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
				System.out.println(carneirinhos + " - Carneirinho(s)");
			}

	}

}
