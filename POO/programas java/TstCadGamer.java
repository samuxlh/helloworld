public class TstCadGamer{

	public static void main(String arg[]){

		CadGamer cg = new CadGamer();
		Leitura l = new Leitura();

		cg.setCgOrigem(l.inData("\n Modelo inspirado no Youtuber: "));
		cg.setPreco(Integer.parseInt(l.inData("\n Preco: "))); 
		cg.setMat(l.inData("\n Material: "));
		cg.setNumPe(Integer.parseInt(l.inData("\n Número de pés: "))); 
		cg.getOrig().setCodP(Integer.parseInt(l.inData("\n Código País: ")));
		cg.getOrig().setNomeP(l.inData("\n Nome do País: "));		

		cg.impLocal();
		System.out.println("\n Modelo inspirado no Youtuber: "+cg.getCgOrigem());
		System.out.println("\n Preco: " +cg.getPreco() +"reais");
		System.out.println("\n material: "+cg.getMat());
		System.out.println ("\n Nemero de pes : " + cg.getNumPe());
		System.out.println("\n Codigo Pais: " +cg.getOrig().getCodP());
		System.out.println("\n Nome do Pais: "+cg.getOrig().getNomeP());
	}
}