package ExercicioAnimal;

public class Animal {
	protected String comer;
	protected String dormir;
	protected String fazerbarulho;
	
	public Animal(String comer, String dormir, String fazerbarulho) {
        this.comer = comer;
        this.dormir = dormir;
        this.fazerbarulho = fazerbarulho;
    }

	public String getComer() {
		return comer;
	}

	public void setComer(String comer) {
		this.comer = comer;
	}

	public String getDormir() {
		return dormir;
	}

	public void setDormir(String dormir) {
		this.dormir = dormir;
	}

	public String getFazerbarulho() {
		return fazerbarulho;
	}

	public void setFazerbarulho(String fazerbarulho) {
		this.fazerbarulho = fazerbarulho;
	}
	
	
	
}

