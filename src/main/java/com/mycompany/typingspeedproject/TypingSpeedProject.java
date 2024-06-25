/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.typingspeedproject;
import java.awt.Taskbar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingUtilities;
/**
 *
 * @author selenyildirim
 */
public class TypingSpeedProject {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() { //invokeLater makes sure coundown is on EDT for safety of GUI
           @Override
           public void run() {
               new Countdown(new Runnable() { //ruunable allows to execute code after a certain event occurs.
                   @Override
                   public void run(){
                       //countdown pops up and then initialize SentenceProvider and TypingCalculator 
                       SentenceProvider sentenceProvider = new SentenceProvider();
                       TypingCalculator calculator = new TypingCalculator(sentenceProvider);
                       calculator.setVisible(true);
                   }
               });
               
           }
           
       });
           
             

       }
}