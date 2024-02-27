
import java.util.Scanner;

public class Bhaskara{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Scanner ABC = new Scanner(System.in);
				int resposta1;
				int resposta2;
				int resposta3;
				int resposta4;
				int A = 0;
				int B = 0;
				int C = 0;
				double D = 0;
				double E = 0;
				int F = 0;
				double baskara = 0;
				double raiz;
				
				for(int u=0; u<10;u++) {
					
			
				System.out.println("escreva o valor de a: ");
				A = 0+ABC.nextInt();
				System.out.println("este valor está correto? \r responda com 1 para sim ou 2 para nao:");
				resposta1 = ABC.nextInt();
						if ( resposta1 == 1 ) { 
							u = 10;
						}
						if(resposta1 != 1) {
							A = F;
						}
						
						}
				
				
				for(int i=0;i<10;i++) {
					
				System.out.println("escreva o valor de b: ");
				B = 0+ABC.nextByte();
				System.out.println("este valor está correto? \r responda com 1 para sim ou 2 para nao:");
				resposta2 = ABC.nextInt();
						if ( resposta2 == 1 ) {
							i = 10;
							
						}
						else B = 0;
					}
				for(int o=0;o<10;o++) {
					
				System.out.println("escreva o valor de c: ");
				C = 0+ABC.nextByte();
				System.out.println("este valor está correto? \r responda com 1 para sim ou 2 para nao:");
				resposta3 = ABC.nextInt();
						if ( resposta3 == 1 ) {
							o = 10;
						}
						else C = 0;
					}
				System.out.println("o valor de A é:" +A);
				System.out.println("o valor de B é:" +B);
				System.out.println("o valor de C é:" +C);
				
				baskara = (B*B)-((4*A)*C);
				System.out.println("O Valor de Bhaskara é: " +baskara);
				if(baskara < 0) {
					System.out.println("Como o valor de bhaskara é inferior a 0, não há como fazer raiz quadrada");
					System.exit(B);
				}
				
				raiz = Math.sqrt(baskara);
				System.out.println("A raiz quadrada de Bhaskara é: " +raiz);
				
				
				System.out.println("Você quer continuar para ver os valores reais de X? \n Digite 1 para sim e 2 para não:");
				resposta4 = ABC.nextInt();
				if (resposta4 == 1) {
					System.out.println("Relembrando a formula a seguir é: -b ± Raiz de delta / 2.a");
					
					D = (-B+raiz)/(2*A);
					
					System.out.println("O valor de x' é: " +D);
					
					E = (-B-raiz)/(2*A);
					
					
					System.out.println("o valor de x'' é " +E);
				
				}
				
				
			

		

	}

}
