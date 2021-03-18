import java.util.ArrayList; 
import java.util.List;
import java.io.FileWriter;

public class Inic {
	public static void main(String arg[]){
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Leitura l = new Leitura();
		BDSist bds = new BDSist();


		List<Pessoa> lstPes = new ArrayList<Pessoa>();

		p1.setId(Integer.parseInt(l.inData("Entre com o codigo da 1 pessoa: ")));
		p1.setNome(l.inData("Entre com o nome da 1 pessoa"));
		bds.setBDPes(p1);
		lstPes = bds.getBDPes();
		p2.setId(Integer.parseInt(l.inData("Entre com o codigo da 2 pessoa: ")));
		p2.setNome(l.inData("Entre com o nome da 2 pessoa"));
		bds.setBDPes(p2);
		lstPes = bds.getBDPes();

		FileWriter writer = new FileWriter("output.txt"); 
		for(String str: bds.setBDPes()) {
			writer.write(str + System.lineSeparator());
		}
		writer.close();

		System.out.println("a lista de pessoas tem tamanho: "+lstPes.size());
			for(int i=0;i<lstPes.size();i++){
			System.out.println("\nCod eh: "+lstPes.get(i).getId());
			System.out.println("Nome eh: "+lstPes.get(i).getNome());
		 }

		bds.altItemBDPes(0,p2); //ALTERANDO ITEM NA POSIÇÃO ZERO
		System.out.println("\n\na lista DEPOIS DE ALTERADA");

		for(int i=0;i<lstPes.size();i++){
			System.out.println("\nCod eh: "+lstPes.get(i).getId());
			System.out.println("Nome eh: "+lstPes.get(i).getNome());
		}

		bds.delItemBDPes(0);//DELETANDO DA LISTA PELO INDICE ZERO
		System.out.println("\n\nlista depois de apagada pelo INDICE zero");

		for(int i=0;i<lstPes.size();i++){
			System.out.println("\nCod eh: "+lstPes.get(i).getId());
			System.out.println("Nome eh: "+lstPes.get(i).getNome());
		}

		bds.delItemBDPes(p2);//DELETANDO DA LISTA PELO INDICE OBJETO P2
		System.out.println("\n\nlista depois de apagada pelo OBJETO P2");

		for(int i=0;i<lstPes.size();i++){
			System.out.println("\nCod eh: "+lstPes.get(i).getId());
			System.out.println("Cod eh: "+lstPes.get(i).getNome());
		}
	}
}