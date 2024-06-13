package Atividade9;

public class ComandoMovCima implements Comando{
	
	private Personagem player;
	
	public ComandoMovCima(Personagem player) {
		super();
		this.player = player;
	}

	@Override
	public void execute() {
		player.moverCima();
	}
	
}
