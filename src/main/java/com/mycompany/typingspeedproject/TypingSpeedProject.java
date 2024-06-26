/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.typingspeedproject;

import javax.swing.SwingUtilities;

public class TypingSpeedProject {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Countdown(); // Start countdown before initializing the main application
                
                SentenceProvider sentenceProvider = new SentenceProvider();
                TypingCalculator calculator = new TypingCalculator(sentenceProvider);
                calculator.setVisible(true);
            }
        });
    }
}
