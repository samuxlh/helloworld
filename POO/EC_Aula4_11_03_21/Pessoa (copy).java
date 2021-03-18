public class Endereco{
	private int num = 0;
	private String rua = ""; 
	
	private Endereco ender = new Endereco();
	
	public Endereco getEnder(){
		return ender;
	}
	
	public void setEnder(Endereco){
		this.ender = ender;
	}
	
	public int getNum(){
		return num;
	}

	public String getRua(){
		return rua;
	}

	public void setNum(int num){
		if(cod >= 0){
			this.cod = cod;
		}
		else{
			System.out.println("\n O codigo deve ter um valor positivo!!!");
		}
	}

	public void setNome(String nome){
		this.nome = nome;
	}

}


