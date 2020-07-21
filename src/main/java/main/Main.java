
package main;
  
import media.Television;
import media.Radio;

public class Main {
    
     public static void main(String[] args) {
            
    Television LG = new Television();
    LG.printAttributes();
    
    LG.setVolume(5);
    LG.setCurrentProgram(12);
    LG.setTurnOn(true);
    LG.printAttributes();
    
    Radio Pure = new Radio();
    Pure.printAttributes();
    
    Pure.setAmFrequency(123);
    Pure.setFmFrequency(99.9);
    Pure.setBand('F');
    Pure.printAttributes();
    
    
    
    
    
}
    

   
    
}
