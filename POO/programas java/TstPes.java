import java.lang.NumberFormatException;
import java.io.IOException;

public class TstPes{
	
	public static void main(String argc[]){

		Pessoa p = new Pessoa();
		Leitura l = new Leitura();
		boolean x = true;

		while(x){
		
			try{
				p.setId(Integer.parseInt(l.inData("\n Informe o ID: ")));
				p.setNome(l.inData("\n Digite o nome: "));
				x = false;
			}
			catch(IdException ido){
				ido.impMsgId();
				ido.newValId();
			}
			catch(PeqException peq){
				peq.mostra();
			}
			catch(NumberFormatException nfe){
				System.out.println("\n O Id deve ser um num ");
			}
			// catch(IOException ioe){
			// System.out.println ("\n Erro de sistema \n");
			// }
			finally{
			System.out.println ("\n Executou o finally \n");
			}
		}

		System.out.println("\n Id : " +p.getId());
		System.out.println("\n Nome : " +p.getNome());

	}
}