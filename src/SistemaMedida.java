
public class SistemaMedida {

	public static void main(String[] args) {
		String sigla = "M";

		//Observe que a n�vel de sintaxe, n�o tivemos nenhum ganho quanto a redu��o de c�digos e ainda tivemos mais uma preocupa��o: 
		//informar a palavra break em cada alternativa
		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("M�DIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}

}
