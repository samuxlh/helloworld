public final class Banco extends Cadeira{
	private String tipoBanco;

	public void impLocal(){
		super.impLocal();
		System.out.println("\n\n-------Banco-------\n");
	}


	public Banco(){
		tipoBanco = "NULL";
	}

	public void setTipoBanco(String tipoBanco){
		this.tipoBanco = tipoBanco;
	}

	public String getTipoBanco(){
		return tipoBanco;
	}


}


