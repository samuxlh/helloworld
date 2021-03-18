public class Pessoa{
	private int cod = 0;
	private String nome = ""; 
		
	public int getCod(){
		return cod;
	}

	public String getNome(){
		return nome;
	}

	public void setCod(int cod){
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

