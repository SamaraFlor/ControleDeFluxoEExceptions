/*
 * magina que fomos requisitados a criar um sistema de plano telef�nico onde:
O sistema ter� 03 planos: BASIC, MIDIA , TURBO;
BASIC: 100 minutos de liga��o;
M�DIA: 100 minutos de liga��o + WhatsApp e Instagram gr�tis;
TURBO: 100 minutos de liga��o + WhatsApp e Instagram gr�tis + 5 GB Youtube.
 */
public class PlanoOperadora {

	public static void main(String[] args) {
        
		String plano = "M";
		
//		//Realizado com If
//		if(plano == "B") {
//			System.out.println("100 minutos de liga��o");
//		}else if(plano == "M") {
//			System.out.println("100 minutos de liga��o");
//			System.out.println("WhatsApp e Instagram gr�tis");	
//		}else if(plano == "T") {
//			System.out.println("100 minutos de liga��o");
//			System.out.println("WhatsApp e Instagram gr�tis");	
//			System.out.println("5Gb Youtube");	
//		}
		
		//Realizado com switch/case
		
		switch (plano) {
		case "T": {
			System.out.println("5Gb Youtube");
		}
		case "M": {
			System.out.println("WhatsApp e Instagram gr�tis");
		}
		case "B": {
			System.out.println("100 minutos de liga��o");
		}
	}
			
		

	}

}
