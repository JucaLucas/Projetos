package Aula15;
import java.util.Scanner;
import javax.swing.JFrame;
public class JogoDaVelha {
	static int matriz[][] = new int [3][3];
	static boolean vitoria = false;
	static void teste(){
		
		if(matriz[0][0] != 0 && matriz[0][1] != 0 && matriz[0][2] != 0 && matriz[1][0] != 0 && matriz[1][1] != 0 && matriz[1][2] != 0 && matriz[2][0] != 0 && matriz[2][1] != 0 && matriz[2][2] != 0 ){
			System.out.println("Fim de jogo.");
			vitoria =  true;
		}
		if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 == true) {
			vitoria = true;
		}
		if(matriz[2][0] == 1 && matriz[1][1] == 1 && matriz[0][2] == 1 == true) {
			vitoria = true;
		}
		if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 == true) {
			vitoria = true;
		}
		if(matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1 == true) {
			vitoria = true;
		}
		if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 == true) {
			vitoria = true;
		}
		if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 == true) {
			vitoria = true;
		}
		if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1 == true) {
			vitoria = true;
		}
		if(matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1 == true) {
			vitoria = true;
		}
		if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 2 == true) {
			vitoria = true;
		}
		if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 2 == true) {
			vitoria = true;
		}
		if(matriz[2][0] == 1 && matriz[1][1] == 1 && matriz[0][2] == 2 == true) {
			vitoria = true;
		}
		if(matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 2 == true) {
			vitoria = true;
		}
		if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 2 == true) {
			vitoria = true;
		}
		if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 2 == true) {
			vitoria = true;
		}
		if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 2 == true) {
			vitoria = true;
		}
		if(matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 2 == true) {
			vitoria = true;
		}
		
	}
	static boolean escolhaX(int x) {
		if (x==7) {
			if (matriz[0][0] == 1 == false && matriz[0][0] == 2 == false) {
			matriz[0][0] = 1;
			teste();
			return true;
					}
		}
		if (x==8) {	
				if (matriz[0][1] == 1 == false && matriz[0][1] == 2 == false) {
				matriz[0][1] = 1;
				teste();
				return true;
						
			}
		}
		if (x==9) {	
				if (matriz[0][2] == 1 == false && matriz[0][2] == 2 == false) {
				matriz[0][2] = 1;
				teste();
				return true;
						
			}
		}
		if (x==4) {	
				if (matriz[1][0] == 1 == false && matriz[1][0] == 2 == false) {
				matriz[1][0] = 1;
				teste();
				return true;
						
			}
		}
		if (x==5) {	
				if (matriz[1][1] == 1 == false && matriz[1][1] == 2 == false) {
				matriz[1][1] = 1;
				teste();
				return true;
						
			}
		}
		if (x==6) {	
				if (matriz[1][2] == 1 == false && matriz[1][2] == 2 == false) {
				matriz[1][2] = 1;
				teste();
				return true;
						
			}
		}
		if (x==1) {	
				if (matriz[2][0] == 1 == false && matriz[2][0] == 2 == false) {
				matriz[2][0] = 1;
				teste();
				return true;
						
			}
		}
		if (x==2) {	
				if (matriz[2][1] == 1 == false && matriz[2][1] == 2 == false) {
				matriz[2][1] = 1;
				teste();
				return true;
						
			}
		}
		if (x==3) {	
				if (matriz[2][2] == 1 == false && matriz[2][2] == 2 == false) {
				matriz[2][2] = 1;
				teste();
				return true;
						
			}
		}
		return false;
	}
	
	static boolean escolhaO(int x) {
		if (x==7) {
			if (matriz[0][0] == 1 == false && matriz[0][0] == 2 == false) {
			matriz[0][0] = 2;
			teste();
			return true;
					}
		}
		if (x==8) {	
				if (matriz[0][1] == 1 == false && matriz[0][1] == 2 == false) {
				matriz[0][1] = 2;
				teste();
				return true;
						
			}
		}
		if (x==9) {	 
				if (matriz[0][2] == 1 == false && matriz[0][2] == 2 == false) {
				matriz[0][2] = 2;
				teste();
				return true;
						}
			
		}
		if (x==4) {	
				if (matriz[1][0] == 1 == false && matriz[1][0] == 2 == false) {
				matriz[1][0] = 2;
				teste();
				return true;
						}
			
		}
		if (x==5) {	
				if (matriz[1][1] == 1 == false && matriz[1][1] == 2 == false) {
				matriz[1][1] = 2;
				teste();
				return true;
						
			}
		}
		if (x==6) {	
				if (matriz[1][2] == 1 == false && matriz[1][2] == 2 == false) {
				matriz[1][2] = 2;
				teste();
				return true;
						
			}
		}
		if (x==1) {	
				if (matriz[2][0] == 1 == false && matriz[2][0] == 2 == false) {
				matriz[2][0] = 2;
				teste();
				return true;
						
			}
		}
		if (x==2) {	
				if (matriz[2][1] == 1 == false && matriz[2][1] == 2 == false) {
				matriz[2][1] = 2;
				teste();
				return true;
						
			}
		}
		if (x==3) {	
				if (matriz[2][2] == 1 == false && matriz[2][2] == 2 == false) {
				matriz[2][2] = 2;
				teste();
				return true;
						
			}
		}
		return false;
	}

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int respostaO;
			int respostaX;
			System.out.println("++++++++++++++++++++ JOGO DA VELHA +++++++++++++++++");
			System.out.println("\n \n \n");
			do {
			System.out.println("Vez de X.");
			System.out.println("De 1 a 9. \n Onde vai jogar?");
			respostaX = leia.nextInt();
			if (escolhaX(respostaX) == true) {}
			else {
				do {
				System.out.println("O Local ja foi selecionado anteriormente, escolha outro.");
				respostaX = leia.nextInt();
				}
				while(escolhaX(respostaX)==false);
				}
if(vitoria == true) {
	break;
	
}
			
			System.out.println("Vez de O.");
			System.out.println("De 1 a 9. \n Onde vai jogar?");
			respostaO = leia.nextInt();
			if (escolhaO(respostaO) == true) {
				}
			else {
				do {
				System.out.println("O Local ja foi selecionado anteriormente, escolha outro.");
				respostaO = leia.nextInt();
				}
				while(escolhaO(respostaO)==false);
				}
			teste();
			}
			while (vitoria == false);
		}
	}

}
