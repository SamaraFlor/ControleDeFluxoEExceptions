
public class CaixaEletronico {
	public static void main(String[] args) {
			double saldo = 0.25;
			double valorSolicitado = 0.18;
			
			//A instrução condicional if em Java tem por finalidade tomar uma decisão de acordo 
			//com o resultado de uma condição especificada (teste lógico). Dependendo do resultado 
			//retornado pelo teste lógico realizado, um bloco de instruções específico será executado.
			if (valorSolicitado < saldo) {
				saldo = saldo - valorSolicitado;

				System.out.println(saldo);

			}
	}
}
