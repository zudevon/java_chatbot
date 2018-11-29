/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame; // for GUI
import javax.swing.JTextArea; // For text feild/space
import javax.swing.JTextField; // text feild at bottom

public class ChatBot extends JFrame {
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	public ChatBot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
                
                // setup for space in chatbot
		frame.setSize(600, 600);
		frame.setTitle("HT_ChatBot");
		frame.add(Chatarea);
		frame.add(chatbox);
		

                //FOR TEXTAREA
		Chatarea.setSize(500 , 400);
		Chatarea.setLocation(2, 2);
		
		//FOR TEXTFEILD
		chatbox.setSize(510, 30);
		chatbox.setLocation(2, 500);
		
		chatbox.addActionListener(new ActionListener() {
                            
                    
                        // switch cases for responses 
                        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String gtext = chatbox.getText().toLowerCase(); // lowercase is important
				Chatarea.append("YOU ->"+gtext + "\n");
				chatbox.setText("");
				
                                // sent gText to respnse function
                                response(gtext);
                                
                                
                                /*
                                switch (gtext){
                                    case "hi":
                                        ChatBot("Hello");
                                        break;
                                    case "wassup":
                                       ChatBot("wuss good"); 
                                       break;
                                    case "yes":
                                       ChatBot("Okay how can I help?"); 
                                       break;
                                    case "no":
                                       ChatBot("no? I am sorry I could not help. Is there anything else I can help you with?"); 
                                       break;
                                       
                                    default:
                                        ChatBot("I'm sorry, I did not understand your response");
                                }
                                */
			}
			
		});
	}
            
        @SuppressWarnings("empty-statement")
        public void response (String someText){
            
            String CB_response = "";
            
            // intialize Array
            String A[][] = {
                // how can I help respnse
                {"hey", "Hi there! How can I help you with java today?"},
                {"hello", "Hi there! How can I help you with java today?"},
                {"whats up", "Hi there! How can I help you with java today?"},
                {"what's up", "Hi there! How can I help you with java today?"},
                {"hi", "Hi there! How can I help you with java today?"},
                {"wassup", "Hi there! How can I help you with java today?"},
                
                // I can help with java respnse
                // {"I need help with strings"
                // I can help with gui
                
                // I can help with if statements
                            
            };   
            // linear sort for java
            for (String[] A1 : A) {
                if (someText.equals((A1[0]))) {
                    // bot needs to push out response on same index as the target
                    // System.out.println("Element found at index " + i);
                    CB_response = A1[1];
                    break;
                } else {
                    CB_response = "Im sorry, I am not able to understand your statement";
                }
            } ; 
            
           ChatBot(CB_response);
            
            
                    
            
            
        }
        
        
	public void ChatBot(String string) {
		Chatarea.append("BOT ->"+string+"\n");
}

	public static void main(String[] args) {
		new ChatBot();

	}

}
