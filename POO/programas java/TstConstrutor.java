public class TstConstrutor{
	
	public static void main(String arg[]){
	Cadeira c1 = new Cadeira();	//instanciação

	System.out.println ("\n Peso : " + c1.getPeso() +"Kg");
	System.out.println ("\n Material : " +c1.getMat());
	System.out.println ("\n Código do país : " + c1.getOrig());

	Leitura l = new Leitura();
	
	c1.setPeso(Integer.parseInt(l.inData(" \n Peso:")));
	String material = l.inData("\n Informe o material: \n");
	System.out.println ("\n Peso : " + c1.getPeso() +"Kg");
	System.out.println ("\n Material : " +material);
	

	}
}	