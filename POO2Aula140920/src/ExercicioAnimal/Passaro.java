package ExercicioAnimal;

public class Passaro extends Animal{
	private String voar;
	private String botaovo;
	
	public Passaro(String comer, String dormir, String fazerbarulho) {
		super(comer,dormir,fazerbarulho);
	}
	
	public Passaro(String comer, String dormir, String fazerbarulho, String voar, String botaovo) {
		super(comer, dormir,fazerbarulho);
		this.voar = voar;
		this.botaovo = botaovo;
	}

	public String getVoar() {
		return voar;
	}

	public void setVoar(String voar) {
		this.voar = voar;
	}

	public String getBotaovo() {
		return botaovo;
	}

	public void setBotaovo(String botaovo) {
		this.botaovo = botaovo;
	}
	
	
}