
package main.multimedia;

public class Television {
    
    private int Volume;
    private int currentProgram;
    private boolean turnOn;
    
    public Television() {
        this.Volume = 0;
        this.currentProgram =1;
        this.turnOn = true;
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

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    
}
