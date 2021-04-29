import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;


public class GUI extends JFrame implements ActionListener{

    public static final int DRAW_SIZE = 400;
    private Color changeColorDraw = Color.BLACK;
    Point[] tabPoint = new Point[10];
    private int index;

    public GUI(){

        super("GUI 7");
        index = 0;

        setSize(DRAW_SIZE, DRAW_SIZE);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panneau = new JPanel();
        panneau.setBackground(Color.blue);
        add(panneau, BorderLayout.NORTH);

        JButton bouton1 = new JButton("Shape");
        JButton bouton2 = new JButton("Quit");

        panneau.add(bouton1);
        panneau.add(bouton2);

        bouton1.addActionListener(this);
        bouton2.addActionListener(this);

        DrawPanel graph = new DrawPanel();
        graph.setBackground(Color.WHITE);
        add(graph, BorderLayout.CENTER);

        setJMenuBar(createMenu());

    }

    public void actionPerformed(ActionEvent e){

        String command = e.getActionCommand();

        if(command.equals("Shape") && index < 10){

            Point p = new Point((int)(Math.random() * DRAW_SIZE),(int)(Math.random() * DRAW_SIZE));
            addPoint(p);
            repaint();

        }
        else if (command.equals("Black")){

            changeColorDraw = Color.BLACK;
            repaint();
        }
        else if (command.equals("Red")){

            changeColorDraw = Color.RED;
            repaint();
        }
        else if (command.equals("Green")){

            changeColorDraw = Color.GREEN;
            repaint();
        }
        else if (command.equals("Blue")){

            changeColorDraw = Color.BLUE;
            repaint();
        }

        if(command.equals("Quit")){
            System.exit(0);
        }
       

    }

    public JMenuBar createMenu() {
        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("ColorMenu");
        bar.add(menu);

        JMenuItem item = new JMenuItem("Black");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Red");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Green");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Blue");
        item.addActionListener(this);
        menu.add(item);
        return bar;
    }


    private void addPoint(Point p){

        tabPoint[index]=p;
        index++;

    }

    private class DrawPanel extends JPanel{

        public void paint(Graphics g){
            super.paint(g);
            g.setColor(changeColorDraw);
            for(int i=1; i < index; i++){

                int x1 = (int) tabPoint[i-1].getX();
                int y1 = (int) tabPoint[i-1].getY();

                int x2 = (int) tabPoint[i].getX();
                int y2 = (int) tabPoint[i].getY();


                g.drawLine(x1, y1, x2, y2);
            }
        }

    }

    public static void main(String[] args) {

        GUI gui = new GUI();
        gui.setVisible(true);
    }

}

/*import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Point; // Je ne pense pas que j'ai besoin de ça
import java.lang.Math;

public class GUI extends JFrame implements ActionListener{

	public static final int DRAW_SIZE = 400;

	private DrawPanel dp = new DrawPanel();

	private int counter = 0;
	Point[] tabPoints = new Point[10];

	public GUI(){
		super("GUI 5"); //Donner le titre


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

		panel2.add(dp);
		
	}

	private void addPoint(Point p){
		p = new Point(  (int)(Math.random() * DRAW_SIZE),  (int)(Math.random() * DRAW_SIZE) );

	}

	public void actionPerformed(ActionEvent e){ 
		String command = e.getActionCommand();
		if(command.equals("Shape") && counter < 10){
			System.out.println("Le boutton 'Shape' a ete clique");
			addPoint(tabPoints[counter]);

			
			dp.repaint();
			counter = counter + 1;

		}

		if(command.equals("Quit")){
			System.out.println("Le boutton 'Quit' a ete clique");
		}

		//System.out.println("actionPerformed was called: " + e.getActionCommand());
	}

	private class DrawPanel extends JPanel{
		//repaint();

		//public void paint(Graphics g){
		//	super.paint(g);
		//	int x1 = tabPoints[counter - 1].x;
		//	int y1 = tabPoints[counter - 1].y;
		//	int x2 = tabPoints[counter].x;
		//	int y2 = tabPoints[counter].y;
		//	g.drawLine(x1,y1,x2,y2);
		//} 

		public void paint(Graphics g){
			super.paint(g);
		    for(int i=1; i<counter; i++){
		   	  
		       int x1 = tabPoints[i-1].x;
		       int y1 = tabPoints[i-1].y;

		       int x2 = tabPoints[i].x;
		       int y2 = tabPoints[i].y;


		       g.drawLine(x1,y1,x2,y2);
		   }

		}

	}

	public static void main(String[] args){
		//new GUI("GUI 1");
		new GUI();
		//new DrawPanel();
		
	}

}
*/
		