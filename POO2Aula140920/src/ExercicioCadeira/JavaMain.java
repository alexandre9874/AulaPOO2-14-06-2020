package ExercicioCadeira;

public class JavaMain {
	public static void main(String[] args) {
	
	Cadeira cs = new Cadeira (40,15,"Azul","Tok & Stok","Cadeira 9000");
	CadeiraDeMassagem cdm = new CadeiraDeMassagem (80,40,"Preta","Stok & Tok","Relaxing Chair 10000","Shopping");
	CadeiraDePraia cdp = new CadeiraDePraia (30,10,"Azul","Seu Zé cadeiras","Cadeira Simples do Seu Zé","Praia");
	
	System.out.println("================= CADEIRA =================");
	System.out.println(cs.getTamanho());
	System.out.println(cs.getPeso());
	System.out.println(cs.getCor());
	System.out.println(cs.getMarca());
	System.out.println(cs.getModelo());
	System.out.println("================= CADEIRA =================");
	
	System.out.println(" ");
	
	System.out.println("================= CADEIRA DE MASSAGEM=================");
	System.out.println(" ");
	System.out.println(cdm.toString());
	System.out.println(" ");
	System.out.println("================= CADEIRA DE MASSAGEM =================");
	
	System.out.println(" ");
	
	System.out.println("================= CADEIRA DE PRAIA=================");
	System.out.println(" ");
	System.out.println(cdp.toString());
	System.out.println(" ");
	System.out.println("================= CADEIRA DE PRAIA =================");
	}
}
