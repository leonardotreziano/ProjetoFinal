
public class CorpoACorpo extends Arma {

	public CorpoACorpo(String nome, int danoMax, int durabilidade) {
		super(nome, danoMax, durabilidade);
		
	}
	@Override
	public String usarArma() {
		
		return "Avan�ando em dire��o ao inimigo!" ;
		
}
	@Override
	public int atacar() {
		return this.getDanoMax()+this.durabilidade;
	
	}
	@Override
	public  boolean usaApenasUmaMao(){
		return true;
}
}