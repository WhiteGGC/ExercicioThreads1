package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int vetor[] = new int[1000];
		for(int i:vetor){
			vetor[i] = (int)(Math.random() * 100 + 1);
		}
		
		Thread threadPar = new ThreadVetor(2, vetor);
		Thread threadImpar = new ThreadVetor(1, vetor);
		threadPar.start();
		threadImpar.start();
	}

}
