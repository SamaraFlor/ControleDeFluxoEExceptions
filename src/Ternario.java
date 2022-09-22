
public class Ternario {

	public static void main(String[] args) {
	
		int nota = 7;
		
		// podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário.
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}

	}


