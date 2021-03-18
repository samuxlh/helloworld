import javax.swing.JOptionPane;

public class CxMsg {
	public static void main(String args[]){
		
		//caixa de Mensagem
		JOptionPane.showMessageDialog(null, "TEXTO INTERNO","TITULO",JOptionPane.PLAIN_MESSAGE);
		
		//caixa de entrada de texto
		String x = JOptionPane.showInputDialog(null, "TXT INTERNO","TITULO",JOptionPane.PLAIN_MESSAGE);
		
		//retorno da caixa de entrada
		JOptionPane.showMessageDialog(null, "Você digitou "+x,"Retorno do caixa de entrada",JOptionPane.PLAIN_MESSAGE);
		
		//caixa de confirmação
		int y = JOptionPane.showConfirmDialog(null, "TXT INTERNO", "TITULO",JOptionPane.YES_NO_CANCEL_OPTION);
		
		//tratamento do retorno de JOptionPane.YES_NO_CANCEL_OPTION da caixa de confirmação
		if(y==0)JOptionPane.showMessageDialog(null, "Clicou no SIM - Y vale 0","Retorno da cx de confirmação",JOptionPane.PLAIN_MESSAGE);
		if(y==1)JOptionPane.showMessageDialog(null, "Clicou no NÃO - Y vale 1","Retorno do caixa de confirmação",JOptionPane.PLAIN_MESSAGE);
		if(y==2)JOptionPane.showMessageDialog(null, "Clicou no CANCELAR - Y vale 2","Retorno do caixa de confirmação",JOptionPane.PLAIN_MESSAGE);
	}
}