public class TstBanco{

	public static void main(String arg[]){

		Leitura l = new Leitura();
		Banco ban = new Banco();

		ban.setTipoBanco(l.inData("\n Tipo do Banco: "));
		ban.setPreco(Integer.parseInt(l.inData("\n Preco: "))); 
		ban.setNumPe(Integer.parseInt(l.inData("\n Número de pés: "))); 
		ban.setMat(l.inData("\n Material: "));
		ban.getOrig().setCodP(Integer.parseInt(l.inData("\n Código País: ")));
		ban.getOrig().setNomeP(l.inData("\n Nome do País: "));		

		ban.impLocal();		
		System.out.println("\n tipo banco: "+ban.getTipoBanco());
		System.out.println("\n Preco: " +ban.getPreco() +"reais");
		System.out.println ("\n Numero de pes : " + ban.getNumPe());
		System.out.println("\n material: "+ban.getMat());
		System.out.println("\n Codigo Pais: " +ban.getOrig().getCodP());
		System.out.println("\n Nome do Pais: "+ban.getOrig().getNomeP());
	}
}