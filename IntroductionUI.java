import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Area;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class IntroductionUI  extends JFrame implements ActionListener, MouseListener{
	
	private Area startBox;
	
	private JLabel label;
	private StartGameView startGame;
	
	public IntroductionUI(){
		JPanel panel = new JPanel(new BorderLayout());
		label = new JLabel("", new ImageIcon("C:\\CLO\\ClientGUI\\TitlePage.png"), JLabel.CENTER);
		panel.add(label, BorderLayout.CENTER);
		
		label.addMouseListener(this);
		
		startBox = new Area(new Rectangle(810, 810, 96, 32));
		
		add(panel);
		setTitle("ClO GameClient");
		setSize(810, 810);
		setLocation(300, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    setVisible(true);
	    setResizable(false);
	    
	  
	    
	    
	    
	    
	}
	
	
	

	
	public void mouseClicked(MouseEvent e) {
		
			startGame = new StartGameView();
			dispose();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main (String[]args) {
		IntroductionUI i = new IntroductionUI();
	}
}
