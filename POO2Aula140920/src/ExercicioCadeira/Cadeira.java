package ExercicioCadeira;

public class Cadeira {
	public double tamanho;
	public double peso;
	public String cor;
	private String marca;
	private String modelo;

	
	public Cadeira(double tamanho, double peso, String cor, String marca, String modelo) {
        this.tamanho = tamanho;
        this.peso = peso;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }


	public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void inclinar (double graus) {
		System.out.println("Cadeira inclinada a 90º");
	}
	
	public void massagear () {
		System.out.println("Infelizmente não consigo massagear");
		
	}
	
}
