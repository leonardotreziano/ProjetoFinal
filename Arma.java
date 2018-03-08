public class Arma implements IComportamentoArma {
	protected int danoMax;
	protected int durabilidade;
	protected String nome;
	private boolean maoDireita;
	private boolean maoEsquerda;
	
	
	public Arma(String nome,int danoMax, int durabilidade) {
		super();
		this.danoMax = danoMax;
		this.durabilidade = durabilidade;
		this.setMaoDireita(true);
		this.setMaoEsquerda(false);
	}
	public String examinar(){
		return nome ;
		
	}
	
	
	public  boolean usaApenasUmaMao(){
		return true;
	}
	


	public int getDanoMax() {
		return danoMax;
	}
	public void setDanoMax(int danoMax) {
		this.danoMax = danoMax;
	}
	public int getDurabilidade() {
		return durabilidade;
	}
	public void setDurabilidade(int durabilidade) {
		this.durabilidade = 0;
	}
	@Override
	public int atacar() {
		
		return 0;
	}

	@Override
	public String usarArma() {
		return "";
		
	}
	public boolean getMaoDireita() {
		return maoDireita;
	}
	public void setMaoDireita(boolean maoDireita) {
		this.maoDireita = true;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getMaoEsquerda() {
		return this.maoEsquerda= false;
	}
	public void setMaoEsquerda(boolean maoEsquerda) {
		this.maoEsquerda = maoEsquerda;
	}
	
	
	

}
