
public class CaixaEletronico {
	public static void main(String[] args) {
			double saldo = 0.25;
			double valorSolicitado = 0.18;
			
			//A instru��o condicional if em Java tem por finalidade tomar uma decis�o de acordo 
			//com o resultado de uma condi��o especificada (teste l�gico). Dependendo do resultado 
			//retornado pelo teste l�gico realizado, um bloco de instru��es espec�fico ser� executado.
			if (valorSolicitado < saldo) {
				saldo = saldo - valorSolicitado;

				System.out.println(saldo);

			}
	}
}
