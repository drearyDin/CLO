import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ChatView extends JPanel{
private ArrayList<ChatEntry> history = new ArrayList<ChatEntry>();
private JTextField chatMessages = new JTextField();
private TitledBorder ch = new TitledBorder("ChatView");

public ChatView(){
	super();
	chatMessages.setBorder(ch);
	add(chatMessages);
	setLayout(new GridLayout(1,1));
	
}


}
