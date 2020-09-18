package ExercicioCadeira;

public class CadeiraDePraia extends Cadeira{
	public String local;
	
	public CadeiraDePraia (double tamanho, double peso, String cor, String marca, String modelo) {
		super(tamanho, peso, cor, marca, modelo);
	}
	
	public CadeiraDePraia (double tamanho, double peso, String cor, String marca, String modelo,String local) {
		super(tamanho, peso, cor, marca, modelo);
		this.local = local;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "A cadeira de praia ela est� na loja de " + local + " do seu z� precisa alugar com ele, ela pesa " + getPeso()  + " ,a altura dela � " + getTamanho()+ " ,� da cor " + getCor() + " ,� da marca " + getMarca() + " e o modelo � " + getModelo() + ".";
	}
	
	
}
