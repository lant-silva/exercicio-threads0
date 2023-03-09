package view;
import java.util.Scanner;
import controller.ThreadVetor;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[1000];
		int escolha=0;
		
		for(int j=0;j<1000;j++) {
			
			vetor[j] = (int) (Math.random()*1001);
		}
		
		System.out.println("Escolha um numero(1 ou 2)");
		while(escolha!=1 && escolha!=2) {
			escolha = input.nextInt();
			if(escolha==1) {
				Thread t = new ThreadVetor(escolha, vetor);
				t.start();
			}else {
				if(escolha==2) {
					Thread t = new ThreadVetor(escolha, vetor);
					t.start();
				}
				else {
					System.out.println("Escolha 1 ou 2!!!");
				}
			}
		}
	}
}
