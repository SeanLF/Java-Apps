import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Sean
 *
 */
public class Launcher extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel launcher = new JPanel(new GridLayout(2,2));
	private JButton[] app = {
			new JButton("BattleShip"), new JButton("Email Server"), new JButton("Email Client"), new JButton("Text Edit")};



	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			if(e.getSource()==app[0]){
				System.out.println("BShip");
				Runtime.getRuntime().exec("java -jar resource/BattleShip.jar");
			}
			if(e.getSource()==app[1]){
				System.out.println("EServer");
				Runtime.getRuntime().exec("java -jar resource/EmailServer.jar");
			}
			if(e.getSource()==app[2]){
				System.out.println("EClient");
				Runtime.getRuntime().exec("java -jar resource/EmailClient.jar");
			}
			if(e.getSource()==app[3]){
				System.out.println("TEdit");
				Runtime.getRuntime().exec("java -jar resource/TextEdit.jar");
			}
		}catch(Exception er){}
			
	}
	
	/**
	 * 
	 */
	public Launcher() {
		super("App Launcher");
		add(launcher);
		for(int i=0;i<4;i++){
			launcher.add(app[i]);
			app[i].addActionListener(this);
		}
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Launcher();
	}

}
