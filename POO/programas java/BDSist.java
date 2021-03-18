import java.util.ArrayList; 
import java.util.List;

public class BDSist {
	private ArrayList<Pessoa> BDPes = new ArrayList<Pessoa>();

	//método para INSERIR obj na lista	 
	public void setBDPes(Pessoa pes){
	 	BDPes.add(pes); //inserindo obj na lista
		System.out.println("\n\nPessoa "+pes.getId()+" "+pes.getNome()+" cadastrada com sucesso!");
 	}

	//método para RETORNAR TODA a lista	
	public ArrayList<Pessoa> getBDPes(){
		System.out.println("\n\nLista de Pessoas retornadas cadastrada com sucesso!");
	 	return BDPes; //retornando a lista
	}

	//método para ALTERAR obj da lista	
	public void altItemBDPes(int local, Pessoa pes){
		BDPes.set(local, pes); //alterando obj da lista
		System.out.println("\n\nPessoa alterada com sucesso!");
	}

	//metodo para APAGAR obj da lista pelo iNDICE (inteiro)	
	public void delItemBDPes(int local){
		BDPes.remove(local); //apagando obj da lista pelo índice (inteiro)
		System.out.println("\n\nPessoa removida com sucesso!");
	}

	//método para APAGAR obj da lista pelo encontro do OBJ em sua primeira ocorrência	
	public void delItemBDPes(Pessoa pes){
		BDPes.remove(pes); //apagando obj da lista pelo obj
		System.out.println("\n\nPessoa removida com sucesso!");
	}
}