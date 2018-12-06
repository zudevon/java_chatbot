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

import java.util.*;
import scr.splash;
import java.awt.Color;

public class ChatBot extends JFrame {
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	// private JButton  button1 = new JButton();
        
        /*
        public class ChatBot extends JFrame {
            private JTextArea Chatarea = new JTextArea();
            private JTextField chatbox = new JTextField();
            // private JButton  button1 = new JButton();
        
        */
        
        public ChatBot() {
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
            // frame.add(button1);


            Chatarea.setEditable(false); 

            Chatarea.setLineWrap(true); 

            Chatarea.setWrapStyleWord(true);

            //FOR TEXTAREA
            Chatarea.setSize(500 , 400);
            Chatarea.setLocation(50, 50);

            int yes = 1;
            int No = 2;
		
            //FOR TEXTFEILD
            chatbox.setSize(510, 30);
            chatbox.setLocation(50, 500);

		
		chatbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String gtext = chatbox.getText().toLowerCase(); // lowercase is important
				Chatarea.append("YOU ->"+gtext + "\n");
				chatbox.setText("");
				
                                // sent gText to respnse function
                                response(gtext);
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
                
                // I can help with java strings
                {"strings", "Try this link to help with strigs https://www.tutorialspoint.com/java/java_strings.htm"},
                {"string", "Try this link to help with strigs https://www.tutorialspoint.com/java/java_strings.htm"},
                
                // I can help with gui
                {"gui", "Try this link to help with creating a GUI in java. https://netbeans.org/kb/docs/java/gui-functionality.html"},
                {"giu", "Try this link to help with creating a GUI in java. https://netbeans.org/kb/docs/java/gui-functionality.html"},
                
                // I can help with if statements
                {"if", "If need help with if statemnts, go to this link. https://www.tutorialspoint.com/java/java_decision_making.htm"},
                {"decision", "If need help with if statemnts, go to this link. https://www.tutorialspoint.com/java/java_decision_making.htm"},
                {"else", "If need help with if statemnts, go to this link. https://www.tutorialspoint.com/java/java_decision_making.htm"},
                
                // I need help with arrays in java
                {"arrays", "If you need help with Arrays or lists try this link. https://www.tutorialspoint.com/java/java_arrays.htm "},
                {"array", "If you need help with Arrays or lists try this link. https://www.tutorialspoint.com/java/java_arrays.htm "},
                {"list", "If you need help with Arrays or lists try this link. https://www.tutorialspoint.com/java/java_arrays.htm "},
                {"lists", "If you need help with Arrays or lists try this link. https://www.tutorialspoint.com/java/java_arrays.htm "},
                
                // I need help with numbers in java
                {"ints", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "},
                {"int", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "},
                {"numbers", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "},
                {"floats", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "},
                {"float", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "},
                {"doubles", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "}, 
                {"double", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "},
                {"math", "If you need help with Numbers or Integers try this link. https://www.tutorialspoint.com/java/java_numbers.htm "},
                
                // I need help with classes
                {"class", "If you need help with Classes or Objects try this link. https://www.tutorialspoint.com/java/java_object_classes.htm "},
                {"classes", "If you need help with Classes or Objects try this link. https://www.tutorialspoint.com/java/java_object_classes.htm "},
                {"objects", "If you need help with Classes or Objects try this link. https://www.tutorialspoint.com/java/java_object_classes.htm "},
                {"object", "If you need help with Classes or Objects try this link. https://www.tutorialspoint.com/java/java_object_classes.htm "},
                
                // I need help with methods in java
                {"method", "If you need help with Methods try this link. https://www.tutorialspoint.com/java/java_methods.htm "},
                {"methods", "If you need help with Methods try this link. https://www.tutorialspoint.com/java/java_methods.htm "},
                
                // I need help with files in java
                {"file", "If you need help with Files and I/O try this link. https://www.tutorialspoint.com/java/java_files_io.htm "},
                {"files", "If you need help with Files and I/O try this link. https://www.tutorialspoint.com/java/java_files_io.htm "},
                {"open", "If you need help with Files and I/O try this link. https://www.tutorialspoint.com/java/java_files_io.htm "},
                {"file input", "If you need help with Files and I/O try this link. https://www.tutorialspoint.com/java/java_files_io.htm "},
                
                // I need help with oop 
                {"oop", "If you need help with Object Oriented Programming try this link. https://www.tutorialspoint.com/java/java_inheritance.htm "},
                {"oriented", "If you need help with Object Oriented Programming try this link. https://www.tutorialspoint.com/java/java_inheritance.htm "},
                {"programming", "If you need help with Object Oriented Programming try this link. https://www.tutorialspoint.com/java/java_inheritance.htm "},
                
                // I need help with Data structures 
                {"data", "If you need help with Data Structures try this link. https://www.tutorialspoint.com/java/java_data_structures.htm"},
                {"struct", "If you need help with Data Structures try this link. https://www.tutorialspoint.com/java/java_data_structures.htm"},
                {"structures", "If you need help with Data Structures try this link. https://www.tutorialspoint.com/java/java_data_structures.htm"},
                
                // I need help with booleans
                {"true", "If you need help with boolean Statements try this link. https://www.dummies.com/programming/java/how-to-use-boolean-expressions-in-java/"},
                {"false", "If you need help with boolean Statements try this link. https://www.dummies.com/programming/java/how-to-use-boolean-expressions-in-java/"},
                {"bool", "If you need help with boolean Statements try this link. https://www.dummies.com/programming/java/how-to-use-boolean-expressions-in-java/"},
                {"boolean", "If you need help with boolean Statements try this link. https://www.dummies.com/programming/java/how-to-use-boolean-expressions-in-java/"},
                
                // Bye or goodbye
                {"bye", "Goodbye friend. I hope all your Java needs were fufilled"},
                {"goodbye", "So long partner"},
                {"good day", "Hang in there dude, have a nice day!"},
                {"see you later", "Peace out my guy"},
                {"later", "Addios, I hope all your Java needs were fufilled"},
            };
            
            
            // linear sort for java
            for (String[] A1 : A) {
                
                // if (someText.equals((A1[0]))) { // use a contain function
                // if array element contains someText
                // .contains()
                if(A1[0].contains(someText) || someText.contains(A1[0])){
                    
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
            
            splash Splash = new splash();
            Splash.setVisible(true);
      
            try{
                for (int i =0; i<=100;i++) {
                    Thread.sleep(90);
                    Splash.Counter1.setText(Integer.toString(i) +"%" );
                    Splash.ProgressBar.setValue(i);
                    if (i!=100);{
                        // Splash.setVisible(false);
                        // new ChatBot(); // keeps hittin 100 multiple times
                    }
                }
                Splash.setVisible(false);
                new ChatBot();
            }
            catch(Exception e){
            }
    
}
            
            
            
            // new ChatBot();

	}

}
