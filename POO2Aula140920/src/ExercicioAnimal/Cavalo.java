package ExercicioAnimal;

public class Cavalo extends Animal {
	public String mama;
	
	public Cavalo(String comer, String dormir, String fazerbarulho) {
		super(comer,dormir,fazerbarulho);
	}
	
	public Cavalo(String comer, String dormir, String fazerbarulho, String mama) {
		super(comer, dormir,fazerbarulho);
		this.mama = mama;
	}

	public String getMama() {
		return mama;
	}

	public void setMama(String mama) {
		this.mama = mama;
	}
	
}
