package view;
import java.util.Scanner;
import controller.ThreadVetor;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[1000];
		double escolha=0;
		
		for(int j=0;j<1000;j++) {
			
			vetor[j] = (int) (Math.random()*1001);
		}
		
		System.out.println("Escolha um numero(impar ou par)");
		
		escolha = input.nextDouble();
		if(escolha % 2 != 0) {
			int valor = 1;
			Thread t = new ThreadVetor(valor, vetor);
			t.start();
		}
		else {
			int valor = 2;
			Thread t = new ThreadVetor(valor, vetor);
			t.start();
		}
	}
}
