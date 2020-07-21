
package media;

public class Television {
    
    private int Volume;
    private int currentProgram;
    private boolean turnOn;
    
    public Television() {
        this.Volume = 0;
        this.currentProgram =1;
        this.turnOn = turnOn;
}

    
//    Getter's & Setters
    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    
    
    public void printAttributes() {
        System.out.println("Televizor je ukljucen:" + this.getTurnOn());
        System.out.println("Volumen je: " + this.getVolume());
        System.out.println("Trenutni program je: " + this.getCurrentProgram());
        
    
}
    
}
