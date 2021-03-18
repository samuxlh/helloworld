public class TstServ{		//classe serviço

	public static void main(String arg[]){
		
		Service s = new Service();

		int val1 = s.soma(3,4);
		int val2 = s.calc("oakss","ere");
		int val3 = s.calc();
		
		System.out.println("\n val1...: "+val1);
		System.out.println("\n val2...: "+val2);
		System.out.println("\n val3...: "+val3);


	}
}