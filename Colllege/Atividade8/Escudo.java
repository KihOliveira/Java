package Atividade8;

public abstract class Escudo {
	private Escudo sucessor;
	private String nome;
	
	public Escudo getSucessor() {
		return sucessor;
	}

	public void setSucessor(Escudo sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract int reduzDano(int dano);
}
