package Exceptions;

/*
 * A linguagem Java, dispõe de uma variedade de classes, 
 * que representam exceções e estas classes, são organizadas em uma hierarquia denominadas 
 * Checked and Unchecked Exceptions ou Exceções Checadas e Não Checadas. 
 */

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

	public static void main(String[] args) throws ParseException {
		 
		//Vamos imaginar que precisamos realizar de duas maneiras, 
		//a conversão de uma String para um número, porém o texto contém Alfanuméricos.
		        Number valor = Double.valueOf("a1.75");

		        valor = NumberFormat.getInstance().parse("a1.75");
		        
		        System.out.println(valor);
		       
		        //As linhas 3 e 5, apresentarão uma exceção ao serem executadas, 
		        //e a linha 5 contém um método que pode disparar uma exceção checada, 
		        //logo, nós programadores que iremos usar este método, 
		        //teremos que tratá-la explicitamente com try \ catch.
		    }
}
