package EstruturasRepeticao;

/*
 * Break significa quebrar, parar, frear, interromper. E � isso que se faz, 
 * quando o Java encontra esse comando pela frente. Continue, como o nome diz, ele 'continua' o la�o. 
 * O comando break interrompe o la�o, j� o continue interrompe somente a itera��o atual.
 */
public class ExBreakContinue {

	public static void main(String[] args) {
		
		for(int numero = 1; numero <=5; numero ++){
			if(numero==3)
				break;
			
			System.out.println(numero);
			
		}
		
		for(int numero = 1; numero <=5; numero ++){
			if(numero==3)
				continue;
			System.out.println("usando continue");
			System.out.println(numero);
			
		}
		
}
}
