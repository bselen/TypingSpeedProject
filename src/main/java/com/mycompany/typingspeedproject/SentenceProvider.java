package com.mycompany.typingspeedproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
/**
 *
 * @author selenyildirim
 */
public class SentenceProvider {
   private String words[] = {"apple", "confusing","eloborate", "unknown", "expired", "pinapple", "inherit"};
   private Random random = new Random(); //declare
   
    // public SentenceProvider(String words){
       //  this.words = this.words;
        // this.random = new Random();
         

   
   
      
     public String getRandomSentence(int wordCount){
        StringBuilder sentence = new StringBuilder();
        
         for(int i = 0; i < wordCount; i++){
             int index = random.nextInt(words.length);
             sentence.append(words[index]);
             
             if(i < wordCount -1 ){
               sentence.append(" ");
             }
         }
             
     
         return sentence.toString();
    

    
}
}