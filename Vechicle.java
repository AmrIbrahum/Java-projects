/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestFeedBack;

import java.util.Objects;

/**
 *
 * @author iamr0
 */
public class Vechicle {
    
    private String platNumber ;
    private String power ;
    private Transmition transmition;
    
    

    public Vechicle(String platNumber, String power, Transmition transmition) {
        this.platNumber = platNumber;
        this.power = power;
        this.transmition = transmition;
    }
    
    
    
    
    
    


    public String getPlatNumber() {
        return platNumber;
    }

    public void setPlatNumber(String platNumber) {
        this.platNumber = platNumber;
    }

    public Transmition getTransmition() {
        return transmition;
    }

    public void setTransmition(Transmition transmition) {
        this.transmition = transmition;
    }

   
    public void setTransmition(String s) {
        if(s == "auto"){
            this.transmition = transmition.AUTOMATIC;
            
        }else{
            this.transmition = transmition.MANUAL;
        }
        
    }

    public String getPower() {
        return power;
    }

    @Override
    public String toString() {
        
        
        return   platNumber +":" + power  + transmition.MANUAL.getStr() ;
    }

    
    
    
    
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.platNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vechicle other = (Vechicle) obj;
        return Objects.equals(this.platNumber, other.platNumber);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
