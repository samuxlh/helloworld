import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.lang.ArithmeticException;

public class CriaJan implements ActionListener{

	private static JFrame jan1 = new JFrame("Cadastro");
	private static JLabel rot1 = new JLabel("Nome: ");
	private static JLabel rot2 = new JLabel("Idade: ");
	//private static JLabel rot3 = new JLabel("Resposta: ");
	private static JTextField entrada1 = new JTextField(20); // 20 é tamanho que enxerga
	private static JTextField entrada2 = new JTextField(20); // 20 é tamanho que enxerga
	private static JButton bt1 = new JButton("Confirma");
	private static JButton bt2 = new JButton("Limpar");
	private static JButton bt3 = new JButton("Sair");

	private static JMenuBar barra = new JMenuBar();
	private static JMenu princ = new JMenu("Principal");
	private static JMenuItem it1 = new JMenuItem("Confirma");
	private static JMenuItem it2 = new JMenuItem("Limpar");
	private static JMenuItem it3 = new JMenuItem("Sair");

	private static CriaJan jn = new CriaJan();

	public static void main(String args[]){

		//JFrame jan1 = new JFrame("Primeira Janela");
		//jan1.setTitle("Primeira Janela – Form de Entrada de Dados");
		
		int larg = 300, alt =250;
		jan1.setSize(larg,alt);

		jan1.setJMenuBar(barra);

		barra.add(princ);

		princ.add(it1);
		princ.add(it2);
		princ.add(it3);


		
		//JLabel rot1 = new JLabel("Nome: ");
		//rot1.setText("Rotulo 1 - Nome");
		//jan1.add(rot1);
		//jan1.add(rot2);

		jan1.setDefaultCloseOperation(jan1.EXIT_ON_CLOSE); // fecha o aplicativo clicando no "x"
		//jan1.setDefaultCloseOperation(jan1.DISPOSE_ON_CLOSE); //fecha a janela do aplicativo clicando no "x", abre a anterior

		//JTextField entrada1 = new JTextField(20); // 20 é tamanho que enxerga
		//jan1.add(entrada1);
		//jan1.add(entrada2);		
		//int tam = frase.length();
		//entrada1.setColomus(tam);

		jan1.add(rot1);
		jan1.add(entrada1);
		jan1.add(rot2);
		jan1.add(entrada2);	
		//jan1.add(rot3);
		//jan1.add(entrada3);	

		//JButton bt1 = new JButton("Clique aqui"); 
		jan1.add(bt1);
		jan1.add(bt2);
		jan1.add(bt3);		
		bt1.addActionListener(jn);
		bt2.addActionListener(jn);
		bt3.addActionListener(jn);
		//bt1.setMnemonic('C'); //descomente e veja que traceja o caracter C (teclas de atalho)

		it1.addActionListener(jn);
		it2.addActionListener(jn);
		it3.addActionListener(jn);

		jan1.setLayout(new FlowLayout());
		jan1.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt){
		
		if(evt.getSource().equals(bt1)||evt.getSource().equals(it1)){
			System.out.println("\n Acionou o botao 1 ");
			jan1.dispose();
			//try{
			//	soma();
			//}
			//try{
			//	divisao();
			//}
			//catch(ArithmeticException ae){
			//	JOptionPane.showMessageDialog(null, "Não existe divisão por 0", "Valor Grande", JOptionPane.ERROR_MESSAGE);
			//}
			//catch(ValException ve){
			//	ve.impMsg();
			//}
		}
		if(evt.getSource().equals(bt2)||evt.getSource().equals(it2)){
			entrada1.setText("");
			entrada2.setText("");		
			entrada1.requestFocus();	
		}
		if(evt.getSource().equals(bt3)||evt.getSource().equals(it3)){
			//jan1.dispose();
			System.exit(0);
		}

	}

	public void soma() throws ValException{
		//int x = Integer.parseInt(entrada1.getText());
		//int y = Integer.parseInt(entrada2.getText());
		//int s = (x+y);
		//String res = Integer.toString(s);
		//entrada3.setText(res);
		
		//if(s>10){
		//	throw new ValException();
		//}
	}

	public void divisao() throws ArithmeticException{
		//int x = Integer.parseInt(entrada1.getText());
		//int y = Integer.parseInt(entrada2.getText());
		//if(y!=0){
		//	int s = (x/y);
		//	String res = Integer.toString(s);
		//	entrada3.setText(res);
		//}
		//else{
		//	throw new ArithmeticException();
		//}
		
	}
}