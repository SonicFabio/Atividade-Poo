package questao01;

import java.util.Scanner;

public class Data {

	public static void main(String[]args) {
		String data;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma data. EX: (04/23/2002)");
		data = ler.next();
		
		
	    String mes = data.substring(0, 2);
	    String dia = data.substring(3, 5);
	    String ano = data.substring(6, 10);
	    
	    switch (mes) {
		case "01": System.out.println("Janeiro" + dia +ano);
			break;
		case "02": System.out.println("Fevereiro" + dia +ano);
		    break;
		case "03": System.out.println("Março" + dia +ano);
		    break;
		case "04": System.out.println("Abril" + dia +ano);
		    break;
		case "05": System.out.println("Maio" + dia +ano);
		    break;
		case "06": System.out.println("Junho" + dia +ano);
		    break;
		case "07": System.out.println("Julho" + dia +ano);
		    break;
		case "08": System.out.println("Agosto" + dia +ano);
		    break;
		case "09": System.out.println("Setembro" + dia +ano);
		    break;
		case "10": System.out.println("Outubro" + dia +ano);
		    break;
		case "11": System.out.println("Novembro" + dia +ano);
		    break;
		case "12": System.out.println("Dezembro" + dia +ano);
		    break;

		default:
			break;
		}
	}
}
		