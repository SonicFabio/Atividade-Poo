package questao01;
import java.util.Scanner;


public class Palavra {
		
	
	
	public static void main (String[]agrs){
		String palavra1= "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a palavra que deseja digitar contendo 5 letras? ");
		
		palavra1 = scan.next();
		
		
		if(palavra1.length() == 5) {
			
			for(int x=0; x < 5; x++) {
			
			for(int j=0; j < 5; j++) {
				
			
			for(int i=0; i < 5; i++) {
				System.out.print(palavra1.charAt(x));
				System.out.print(palavra1.charAt(j));
				System.out.println(palavra1.charAt(i));
				
			}
			}
			}
		} else if(palavra1.length() > 5) {
			System.out.println("A palavra digitada tem mais do que 5 letras ");
		} else if (palavra1.length() < 5) {
			System.out.println(" A palavra digitada tem menos do que 5 letras ");
		}

}
}