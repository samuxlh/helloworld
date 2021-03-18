public abstract class Cadeira{		//classe entidade
	private int preco;		//atributos
	private int numPe;
	private String mat;
	private Origem orig = new Origem();

//==================================================

	public void impLocal(){
		System.out.println("\n\n-------Cadeira-------\n");
	}

//...........Métodos Construtores..................

	public Cadeira(){
		preco = 10;
		mat = "aço";
		numPe = 4;
		orig = new Origem();
	}

//==================================================

	public void setOrig(Origem orig){
		this.orig = orig;
	}

	public Origem getOrig(){
		return orig;
	}

//==================================================


	public void setPreco(int preco){
	if (preco > 0)
		this.preco = preco;
	else
		System.out.println ("\n Preco deve ser maior q zero");
	}

	public void setNumPe(int numPe){
	if (numPe > 0)
		this.numPe = numPe;
	else
		System.out.println ("\n Número de pés deve ser maior q zero");
	}
	
	public void setMat(String mat){
		this.mat = mat;
	}

	public int getPreco(){
		return preco;
	}

	public int getNumPe(){
		return numPe;
	}


	public String getMat(){
		return mat;
	}

}


