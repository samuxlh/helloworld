//ve se ja tem pessoa cadastrada com o id inserido
public Pessoa consPesId(Pessoa p){
	for (int i = 0; i < listPes.size() ; i++) {
		if (listPes.get(i).idRg()==p.getId()) {
			return listPes.get(i);
		}
	}
	return NULL;
}

//insere no array novo cadastro, mas só se não existir o id
public boolean inserePessoa (Pessoa p){
	pessoa x = ConsPesId (p);
	if (x = NULL){
		listPes.add(p);
		return true;
	}
	else{
		System.out.Println(x.GetId());
		System.out.Println(x.GetNome());
		return false;
	}
}

//será disparada quando for falso no item anterior
public class PesException extends Exception{
	public void impMsg(){
		JOptionPane.showMessageDialog(NULL, "Já existe uma pessoa com esse id", "Erro de inserção", JOptionPane.ERROR_MESSAGE);
	}
}

public class Prv2 implements ActionListener{
	private static JFrame jan1 = new JFrame("Cadastro de Pessoa");
	private static JLabel rot1 = new JLabel("ID: ");
	private static JLabel rot2 = new JLabel("NOME: ");
	private static JTextField entrada1 = new JTextField(10);
	private static JTextField entrada2 = new JTextField(20);

	private static JMenuBar mb = new JMenuBar();
	private static JMenu prin = new JMenu("Principal");
	private static JMenuItem it1 = new JMenuItem("Cadastrar");
	private static JMenuItem it2 = new JMenuItem("Limpar");
	private static JMenuItem it3 = new JMenuItem("Sair");

	private static Prv2 prv2 = new Prv2();

	private static cadPes cp = new cadPes();
	private static Pessoa pes = new Pessoa();	

	public static void main(args[]){

		int largura = 200, altura = 200;
		jan1.setSize(largura, altura);

		jan1.setJMenuBar(mb);
		mb.add(prin);
		prin.add(it1);
		prin.add(it2);
		prin.add(it3);

		jan1.add(rot1);
		jan1.add(entrada1);
		jan1.add(rot2);
		jan1.add(entrada2);

		it1.addActionListener(prv2);
		it2.addActionListener(prv2);
		it3.addActionListener(prv2);

		jan1.setLayout(new FlowLayout());
		jan1.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt){
		if(evt.getSource().equals(it2)){
			entrada1.setText("");
			entrada2.setText("");
			entrada1.requestFocus();
		}

		if(evt.getSource().equals(it3)){
			System.exit(0);
		}

		if(evt.getSource().equals(it1)){
			pes.setId(Integer.parseInt(entrada1.getText()));
			pes.setNome(entrada2.getText());
			try{
				if(cp.inserePessoa(pes)){
					JOptionPane.showMessageDialog("Sucesso");
				}
				else{
					throw new PesException();
				}
			}

			catch (PesException pe){
				pe.impMsg();
			}
		}
	}

}
