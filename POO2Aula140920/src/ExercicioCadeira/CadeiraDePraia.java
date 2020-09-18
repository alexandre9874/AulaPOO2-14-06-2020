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
		return "A cadeira de praia ela está na loja de " + local + " do seu zé precisa alugar com ele, ela pesa " + getPeso()  + " ,a altura dela é " + getTamanho()+ " ,é da cor " + getCor() + " ,é da marca " + getMarca() + " e o modelo é " + getModelo() + ".";
	}
	
	
}
