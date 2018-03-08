
public class AtaqueADistancia extends Arma {

	public AtaqueADistancia(String nome, int danoMax, int durabilidade) {
		super(nome, danoMax, durabilidade);
		
	}
	@Override
	public String usarArma() {
		System.out.println("Preparar, apontar, vai");
		return null;
	}
	@Override
	public int atacar() {
		
		return 0 + this.danoMax;
	}
	@Override
	public  boolean usaApenasUmaMao(){
		return false;
}

}
