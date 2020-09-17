package ExercicioAnimal;

public class JavaMain {
	public static void main(String[] args) {
		
		Animal umanimal = new Animal ("comendo","dormindo","fazendo barulho");
		Cavalo umcavalo = new Cavalo ("cavalo comendo","cavalo dormindo","cavando fazendo barulho","cavalo mamando");
		Passaro umpassaro = new Passaro ("passaro comendo","passaro dormindo","passaro fazendo barulho","passaro voando","passaro botando ovo");
		
		System.out.println("================= UM ANIMAL =================");
		System.out.println(umanimal.getComer());
		System.out.println(umanimal.getDormir());
		System.out.println(umanimal.getFazerbarulho());
		System.out.println("================= UM ANIMAL =================");
		
		System.out.println(" ");
		
		System.out.println("================= UM CAVALO =================");
		System.out.println(umcavalo.getComer());
		System.out.println(umcavalo.getDormir());
		System.out.println(umcavalo.getFazerbarulho());
		System.out.println(umcavalo.getMama());
		System.out.println("================= UM CAVALO =================");
		
		System.out.println(" ");
		
		System.out.println("================= UM PASSARO =================");
		System.out.println(umpassaro.getComer());
		System.out.println(umpassaro.getDormir());
		System.out.println(umpassaro.getFazerbarulho());
		System.out.println(umpassaro.getVoar());
		System.out.println(umpassaro.getBotaovo());
		System.out.println("================= UM PASSARO =================");
	}

}
