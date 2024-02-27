package tv;

public class Televisao {
	private int volumeAtual;
	private int canalAtual;
	private boolean ligada;
	private String marca;
	
	
	
	public Televisao(String marca) {
		this.marca = marca;
		this.volumeAtual = 50;
		this.canalAtual = 1;
		this.ligada = false;
	}
	
	
	public void ligarTelevisao(){
		this.ligada = true;
	}
	public void desligarTelevisao() {
		this.ligada = false;
	}
	public void almentarVolume(){
		if (this.volumeAtual < 100) {
		this.volumeAtual ++;
	}
	}
	public void diminuirVolume() {
		if(this.volumeAtual > 0) {
			this.volumeAtual--;
		}
	}
	void mudarCanal(int novoCanal) {
		this.canalAtual = novoCanal;
		System.out.println("O canal atual é "+ novoCanal+".");
	}

}
