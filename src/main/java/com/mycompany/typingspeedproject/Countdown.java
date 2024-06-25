/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typingspeedproject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.Font;
import java.awt.Frame;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    
    private static JFrame frame;
    private static JLabel countdownLabel;
    private Runnable onComplete;
    
            
            
   public Countdown(Runnable onComplete){ //constructor
       this.onComplete = onComplete;
       SwingUtilities.invokeLater(() -> {
           displayGUI();
           setCountdown();
       });
   }
       
    
    
    
    private static void displayGUI(){ //display countdown numbers
        frame = new JFrame("Countdown");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        countdownLabel = new JLabel("3");
        countdownLabel.setFont(new Font("Arial", Font.BOLD, 40));
        countdownLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(countdownLabel);
        
        frame.setVisible(true);
   
        
        
    }
    
public static void setCountdown(){
    
    Timer timer = new Timer();
    TimerTask task = new TimerTask() { //defines a that runs every second(1000 miliseconds)
        
        int count =3;
        
        @Override
        public void run() {
           if(count > 0){
                countdownLabel.setText(String.valueOf(count));
                count--;
                
           }
           else{
               countdownLabel.setText("Start");
               timer.cancel();
           }
           
        }
    };
    timer.scheduleAtFixedRate(task, 0, 1000);
    
 
} 

}




