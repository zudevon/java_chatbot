/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

/**
 *
 * @author aqjoseph
 */
public class Scr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      splash Splash = new splash();
      Splash.setVisible(true);
      
      try{
         for (int i =0; i<=100;i++) {
             Thread.sleep(90);
             Splash.Counter1.setText(Integer.toString(i) +"%" );
             Splash.ProgressBar.setValue(i);
             if (i==100);{
             Splash.setVisible(false);
            
         }
         }
      }
    catch(Exception e){
    }
    
}
}

