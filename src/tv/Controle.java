package tv;

public class Controle {

	private Televisao televisao;

	public Controle(Televisao televisao) {
		this.televisao = televisao;
	}
	public void ligar() {
		this.televisao.ligarTelevisao();
	}
	public void desligar() {
		this.televisao.desligarTelevisao();
	}
	public void almentarVolume() {
		this.televisao.almentarVolume();
	}
	public void diminuirVolume() {
		this.televisao.diminuirVolume();
	}
	public void mudarCanal() {
		this.televisao.mudarCanal(0);
	}
	
}
