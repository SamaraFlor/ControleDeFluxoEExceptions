package Exceptions;
/*
 * Exce��es customizadas
N�s podemos criar nossas pr�prias exce��es, 
baseadas em regras de neg�cio e assim melhor direcionar quem for utilizar os recursos desenvolvidos 
no projeto, exemplo:
Imagina que como regra de neg�cio, para formatar um cep, necessita sempre de ter 8 d�gitos, 
caso contr�rio, lan�ar� uma exce��o que denominamos de CepInvalidoException.
Primeiro criamos nossa exce��o:
 */

public class Main {

	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("23765064");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.out.println("este cep n�o corresponde ");
		}

	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
