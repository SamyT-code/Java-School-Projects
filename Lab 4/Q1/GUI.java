import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame{

	public static final int DRAW_SIZE = 400;

	public GUI(){
		super("GUI 1");

		setSize(400, 400);
		setVisible(true);

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		//new GUI("GUI 1");
		new GUI();
	}
}