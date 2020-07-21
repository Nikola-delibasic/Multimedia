
package main;
  
import media.Television;

public class Main {
    
     public static void main(String[] args) {
            
    Television LG = new Television();
    LG.printAttributes();
    
    LG.setVolume(5);
    LG.setCurrentProgram(12);
    LG.setTurnOn(true);
    LG.printAttributes();
    
    
    
    
}
    

   
    
}
