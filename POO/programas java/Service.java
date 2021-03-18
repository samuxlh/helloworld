public class Service{		//classe serviço

	public int soma(int x, int y){
		return(x+y);
	}
	public int sub(int x, int y){
		return(x-y);
	}
	public int mult(int x, int y){
		return(x*y);
	}
	public int div(int x, int y){
		return(x/y);
	}

	public void calc(int x, int y){
		System.out.println ("\n A soma é: "+(x+y));
	}
		
		

	public int calc(String str1, String str2){
		int p = str1.length();
		int q = str2.length();
		return (p*q);
	}

	public int calc(){
		return 10;
	}

	public int calc(String str1, int w){
		return (str1.length()+w);
	}
}