
public class Ternario {

	public static void main(String[] args) {
	
		int nota = 7;
		
		// podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador tern�rio.
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recupera��o" : "Reprovado";
		System.out.println(resultado);
	}

	}


