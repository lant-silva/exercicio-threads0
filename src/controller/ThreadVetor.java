package controller;

public class ThreadVetor extends Thread{

	int i;
	int vetor[] = new int[1000];
	
	public ThreadVetor(int i, int[] vetor) {
		this.i = i;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		iniciaThread();
	}
	
	public void iniciaThread() {
		
		if(i==2) {
			double tempoInicial = (double) System.nanoTime();
			for(int j=0;j<1000;j++) {
				System.out.println(vetor[j]);
			}
			
			double tempoFinal = (double) System.nanoTime();
			tempoFinal = (tempoFinal - tempoInicial) / (Math.pow(10, 9));
			System.out.println("Tempo total de execução: "+tempoFinal+"s");
		}else {
			double tempoInicial = (double) System.nanoTime();
			for(int indices : vetor) {
				System.out.println(indices);
			}
			double tempoFinal = (double) System.nanoTime();
			tempoFinal = (tempoFinal - tempoInicial) / (Math.pow(10, 9));
			System.out.println("Tempo total de execução: "+tempoFinal+"s");
		}
	}
}
