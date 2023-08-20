/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package lingo;
package com.solocoding.lingo; 

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import jaco.mp3.player.MP3Player;
import java.io.InputStream;
import java.nio.file.Files;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javazoom.jl.decoder.Bitstream;
import javazoom.jl.player.advanced.AdvancedPlayer;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;





/**
 *
 * @author guero
 */
public class Alphabet {
     String name = ""; 
     String alphabetName=""; 
     Clip clip;
    
    public Alphabet (String name){
        this.name = name;
    
    }
     public Alphabet (String name, String alphabetName){
        this.name = name;
        this.alphabetName= alphabetName;
    
    }
    /**
     * getter. 
     * @return 
     */
    public String nameGetter(){
        return this.name; 
    }
    
    /**
     * setter. 
     * @param alphabetName 
     */
    public void setAlphabetName(String alphabetName ){
        this.alphabetName= alphabetName;
    }
    /**
     * getter 
     * @return 
     */
    public String AlphabetNameGetter(){
    return this.alphabetName; 
    }
    
    
     
     
    
    
 
//    public  ImageIcon myImageGetter(){
//        ImageIcon icon =  new ImageIcon(getClass().getResource("/images/Images/10.png"));
//      ///  icon.setIconImage(new ImageIcon(getClass().getResource("/red-chip.png")).getImage());
//      
//      return icon;
//    }
     public ImageIcon imageGetter() {
      
                   return  new ImageIcon(getClass().getResource("/images/Images/"+name+".png"));

        
    }
     
      public ImageIcon imageGetter(String currName) {
          return new ImageIcon(getClass().getResource("/images/Images/"+currName+".png"));
        
    }
    
     
    
    
    
    

    
    /**
     * Method to retrieve MP3 audio file off the path and plays an alphabet audio. 
     */
public void getAudio(){
     
    String s = this.name+".mp3"; 
    s = "/Audios/Audio/"+ s; 
   
    MP3Player sound = new MP3Player(getClass().getResource(s));
    sound.play();

}
    
   

/**
 * Method to retrieve audio from folder. 
 * @param aud audio to be retreived name. 
 * @return the MP3 audio requested.
 */
public MP3Player getAudioMP3(String aud){

//     String s = "/Audios/Audio"; 
//        s+=  name+ ".MP3"; 
        
         String s = aud+".mp3"; 
    s = "/Audios/Audio/"+ s; 
    MP3Player sound = new MP3Player(getClass().getResource(s));
    ///sound.play();
    ///System.out.println("lingo.Alphabet.getAudioMP3()");
    return sound; 

}




     public static void main (String [] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
         Alphabet a = new Alphabet("a");
         a.name="16";
         test m = new test();
   ///m.setVisible(true);
         ///a.getAudio();  
//         alphabetsPanel p = new alphabetsPanel();
//         ///p.setVisible(true);
//         FrameDisp f = new FrameDisp(); 
//        /// p.setVisible(true);
//        f.setPanel(p); 
//       
//         
//         ////f.add(p);
//         
//         f.setVisible(true);
a.name= "10"; 
///test te = new test(a); 
a.name = "28"; 
//a.imageGetter(); 
///a.imageGetter("2");
///a.getAudio();
///a.getAudioMP3("3"); 
 ///playMp3FromResources("19.mp3");
 ///a.loadImage("");
 a.getAudioMP3("5");
 
 ///test m = new test();
 
 

         
         
         

}
}
