package Atividade3;

public class Inimigo implements Observador{

	private int x;
	private int y;
	private String nome;
	private int life;
	private int dano = 10;
	
	public Inimigo(int x, int y, String nome) {
		this.x = x;
		this.y = y;
		this.nome = nome;
		this.life = 20;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public void perdeVida(int dano) {
		this.life = life - dano;
	}
	
	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public void atacar(Sujeito s) {
		Personagem personagem = (Personagem)s; //Coercao de tipo
		personagem.perderVida(this.getDano());
	}
	
	@Override
	public void update(Sujeito s) {
		
		Personagem personagem = (Personagem)s; //Coercao de tipo
		
		if(this.x - personagem.getX() == 0 && this.y - personagem.getY() == 0) { //Se estiver perto do personagem
			this.atacar(personagem);
			System.out.println("Inimigo: "+this.nome+" ataca o personagem");
			if(Math.random() < 0.5) {
				personagem.setPos(personagem.getX()+5, personagem.getY()-5);
			}else {
				personagem.setPos(personagem.getX()-5, personagem.getY()+5);
			}
		}else {
			if(personagem.getX() > this.x) {
				this.x = this.x+2;
			}else {
				this.x = this.x-2;
			}
			if(personagem.getY()>this.y) {
				this.y = this.y+2;
			}else {
				this.y = this.y-2;
			}
		}
		
		
	}

}
