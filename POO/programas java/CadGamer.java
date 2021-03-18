public final class CadGamer extends Cadeira{
	private String CgOrigem;

	public void impLocal(){
		super.impLocal();
		System.out.println("\n\n-------Cadeira Gamer-------\n");
	}

	public CadGamer(){
		CgOrigem = "NULL";
	}

	public void setCgOrigem(String CgOrigem){
		this.CgOrigem = CgOrigem;
	}

	public String getCgOrigem(){
		return CgOrigem;
	}


}


