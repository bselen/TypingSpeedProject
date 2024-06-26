package com.mycompany.typingspeedproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 import java.util.Random;

 public class SentenceProvider {
    private String words[] = {"apple", "confusing", "elaborate", "unknown", "expired", "pineapple", "inherit",
                 "car", "grape", "shirt", "dog", "cat", "plank", "orange", "community", "pizza", "elf", "sword", "cape", "pants", "shoes", "box"};
    private Random random = new Random(); //declare
     
     public String getRandomSentence(int wordCount) {
         StringBuilder sentence = new StringBuilder();
         buildSentence(sentence, wordCount);
         return sentence.toString().trim();
     }
 
     //Recursive Method
     private void buildSentence(StringBuilder sentence, int remainingWords) {
         if (remainingWords == 0) {      //base case: terminate when words are zero.
             return;
         }
 
         int index = random.nextInt(words.length);   //Pick random word from words array.
         sentence.append(words[index]);      // Add randoms words to sentence
 
         if (remainingWords > 1) {       //Add a space if there are more words to add.
             sentence.append(" ");
         }
         
         buildSentence(sentence, remainingWords - 1);    //Remove one until base case is reached.
     }
 }