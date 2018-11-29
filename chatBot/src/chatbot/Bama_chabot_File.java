// Put your code here---------------
package chat1;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aqjoseph
 */
public class Chat1 extends JFrame {
private JTextArea Chatarea = new JTextArea();
private JTextField chatbox = new JTextField();
private JButton  button1 = new JButton();

   
public Chat1() {
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
frame.getContentPane().setBackground(Color.ORANGE);
frame.setVisible(true);
frame.setResizable(false);
frame.setLayout(null);
frame.setSize(600, 600);
frame.setTitle("Devon&Anthony");
frame.add(Chatarea);
frame.add(chatbox);
frame.add(button1);


Chatarea.setEditable(false); 

Chatarea.setLineWrap(true); 

Chatarea.setWrapStyleWord(true);

//FOR TEXTAREA
Chatarea.setSize(500 , 400);
Chatarea.setLocation(2, 2);

int yes = 1;
int No = 2;
		
//FOR TEXTFEILD
chatbox.setSize(510, 30);
chatbox.setLocation(2, 500);


 

chatbox.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
String gtext = chatbox.getText().toLowerCase();
Chatarea.append("YOU ->"+gtext + "\n");
chatbox.setText("Welcome to DA Chat Box");
				
if(gtext.contains("are you ok ? yes/No")){
         
    Scanner aScanner = new Scanner(System.in);
    int  a = aScanner.nextInt();
    
    if (a == 1 ){
       System.out.println("Hows your day going"); 
    }
    else{
        System.out.println("Would you like to talk abouyt it");
    }

}				
}			
});

}



private void ChatBot(String string) {
 
Chatarea.append("BOT ->"+string+"\n");
}

public static void main(String[] args) {
new Chat1();

	}

}









// ---------------------------------
