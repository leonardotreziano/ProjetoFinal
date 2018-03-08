
public class Personagem {
	
	private String nome;
	private int maxHP;
	private int HPAtual;
	private int HP;
	
	
	
	public Personagem(String nome, int maxHP, int hPAtual, int hP) {
		this.nome = nome;
		this.maxHP = maxHP;
		HPAtual = hPAtual;
		HP = hP;
	}
	public Personagem (String nome, int maxHP){
		
	}
	public void equiparArma( Arma a){
	
	}
	public void sofrerDano1(int dano){
		
	}
	public int getHP(){
		return this.getHPAtual();
	}
	public String status(){
		return this.getNome()+this.getHPAtual()+ this.getMaxHP();
		
	}
	public void sofrerDano(int atacar) {
		
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getHPAtual() {
		return HPAtual;
	}
	public void setHPAtual(int hPAtual) {
		HPAtual = hPAtual;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	
}
