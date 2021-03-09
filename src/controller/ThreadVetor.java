package controller;

public class ThreadVetor extends Thread{
	
	private int val;
	private int vetor[];
	
	public ThreadVetor(int val, int vetor[]){
		this.val = val;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		percorre();
	}
	
	private void percorre(){
		if(val%2==0){
			double tempoInicial = System.nanoTime();
			for(int i=0; i<vetor.length;i++){
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoFinal = tempoFinal/Math.pow(10, 9);
			System.out.println("Tempo da estrutura for: "+tempoTotal+"s");
		}else if(val%2!=0){
			double tempoInicial = System.nanoTime();
			for(int i : vetor){
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoFinal = tempoFinal/Math.pow(10, 9);
			System.out.println("Tempo da estrutura foreach: "+tempoTotal+"s");
		}
	}
	
}
