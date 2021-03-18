public class Filho extends Mae implements Pai,Tio{
	public void exibe(){
		System.out.println("\n Classe filho");
	}

	public void impDados(){
		System.out.println("\n IMPDADOS na classe filho");
	}

	public void tela(){
		System.out.println("\n TELA na classe filho");
		System.out.println("\n VALOR DE PI: "+pi);

	}


}