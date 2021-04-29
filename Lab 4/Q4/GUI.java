import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{

	public static final int DRAW_SIZE = 400;

	public GUI(){
		super("GUI 4"); //Donner le titre

		JPanel panel1 = new JPanel(); //Créer les panels
		JPanel panel2 = new JPanel();

		add(panel1, BorderLayout.NORTH); //Mettre le panel en haut du frame
		JButton button1 = new JButton("Shape"); //Créer les bouttons
		JButton button2 = new JButton("Quit");

		button1.addActionListener(this);
		button2.addActionListener(this);

		add(panel2, BorderLayout.CENTER);

		panel1.add(button1); //Mettre les bouttons dans le pannel
		panel1.add(button2);

		panel1.setBackground(Color.BLUE); // Donner des couleurs au panneaux
		panel2.setBackground(Color.WHITE);
		

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		//new GUI("GUI 1");
		new GUI();
	}

	public void actionPerformed(ActionEvent e){ 
		String command = e.getActionCommand();
		if(command.equals("Shape")){
			System.out.println("Le boutton 'Shape' a ete clique");
		}

		if(command.equals("Quit")){
			System.out.println("Le boutton 'Quit' a ete clique");
		}

		//System.out.println("actionPerformed was called: " + e.getActionCommand());
	}
}


		//add(panel, BorderLayout.CENTER); 