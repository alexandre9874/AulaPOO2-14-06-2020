package ExercicioCadeira;

public class CadeiraDeMassagem extends Cadeira{
	public String local;
	
	public CadeiraDeMassagem(double tamanho, double peso, String cor, String marca, String modelo) {
		super(tamanho, peso, cor, marca, modelo);
	}
	
	public CadeiraDeMassagem (double tamanho, double peso, String cor, String marca, String modelo,String local) {
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
		return "A cadeira de massagem fica no " + local + " ,para usar ela precisa fornecer 10 reais, ela pesa " + getPeso()  + " e a altura dela é " + getTamanho()+ " ,a cor dela é " + getCor() + " ,a marca é " + getMarca() + " e o modelo é " + getModelo() + ".";
	}
	
	
}
