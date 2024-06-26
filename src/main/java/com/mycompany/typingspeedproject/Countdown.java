/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typingspeedproject;

import javax.swing.*;

public class Countdown {
        public Countdown() {
            int countdownTime = 3; // Countdown from 3
            
            for (int i = countdownTime; i > 0; i--) {
                JOptionPane.showMessageDialog(null, "Starting in " + i, "Countdown", JOptionPane.INFORMATION_MESSAGE);
                try {
                    Thread.sleep(1000); // Sleep for 1 second between messages
                } catch (InterruptedException e) { //thrown when thread is interrupted
                    e.printStackTrace(); //when catch an exception this will show what went wrong
                }
            }
        }
}
