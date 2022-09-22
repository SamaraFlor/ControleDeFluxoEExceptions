package Exceptions;

/*
 * A linguagem Java, disp�e de uma variedade de classes, 
 * que representam exce��es e estas classes, s�o organizadas em uma hierarquia denominadas 
 * Checked and Unchecked Exceptions ou Exce��es Checadas e N�o Checadas. 
 */

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

	public static void main(String[] args) throws ParseException {
		 
		//Vamos imaginar que precisamos realizar de duas maneiras, 
		//a convers�o de uma String para um n�mero, por�m o texto cont�m Alfanum�ricos.
		        Number valor = Double.valueOf("a1.75");

		        valor = NumberFormat.getInstance().parse("a1.75");
		        
		        System.out.println(valor);
		       
		        //As linhas 3 e 5, apresentar�o uma exce��o ao serem executadas, 
		        //e a linha 5 cont�m um m�todo que pode disparar uma exce��o checada, 
		        //logo, n�s programadores que iremos usar este m�todo, 
		        //teremos que trat�-la explicitamente com try \ catch.
		    }
}
