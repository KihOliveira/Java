package Atividade9;

public class ComandoMovEsquerda implements Comando{

private Personagem player;
	
	public ComandoMovEsquerda(Personagem player) {
		super();
		this.player = player;
	}

	@Override
	public void execute() {
		player.moverEsq();
	}
	
}
