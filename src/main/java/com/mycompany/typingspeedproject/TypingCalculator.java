/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typingspeedproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author selenyildirim
 */
public class TypingCalculator extends JFrame {
    private SentenceProvider sentenceProvider;
    private JLabel sentenceLabel;
    private JTextField inputField;
    private JLabel wpmLabel;
    private long startTime;
    private int wordCount = 5;
    
    public TypingCalculator(SentenceProvider sentenceProvider){
        this.sentenceProvider = sentenceProvider;
        calculatorGUI();
        
                
    }
    
    public void calculatorGUI(){
        setTitle("Typing Speed Test");
        setSize(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        sentenceLabel = new JLabel("Press Enter to Start", SwingConstants.CENTER);
        inputField = new JTextField();
        wpmLabel = new JLabel("", SwingConstants.CENTER);
        
      inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               handleInput();
               
      }
    });
        setLayout(new BorderLayout());
        add(sentenceLabel, BorderLayout.NORTH);
        add(inputField, BorderLayout.CENTER);
        add(wpmLabel,BorderLayout.SOUTH);
        
    }
    
    private void handleInput(){
        String inputText = inputField.getText();
        if(startTime == 0){
            startTyping();
            
        } else{
            checkInput(inputText);
            
        }
    }
   
    private void startTyping(){
        startTime = System.currentTimeMillis();
        String sentence = sentenceProvider.getRandomSentence(wordCount);
        sentenceLabel.setText(sentence);
        inputField.setText("");
        inputField.requestFocus();
              
    }
    
    private void checkInput(String inputText){
        long endTime = System.currentTimeMillis();
        String displaySentence = sentenceLabel.getText();
        
        if(inputText.trim().equals(displaySentence.trim())){
        long totalTime = endTime - startTime;
        double timeInMinutes = totalTime / 60000.0;
        int wpm = (int) (wordCount / timeInMinutes);
        
        wpmLabel.setText("WPM: " + wpm);
        startTime = 0;
        inputField.setText("");
        sentenceLabel.setText("Press Enter to Start");
        } else{
            wpmLabel.setText("Incorrect! Try again.");
        } 
      
    }
  
}
