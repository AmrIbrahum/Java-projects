/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestFeedBack;

/**
 *
 * @author iamr0
 */
public class Van extends Vechicle {
    int carryingCapacity ;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Van(int carryingCapacity, String platNumber, String power, Transmition transmition) {
        super(platNumber, power, transmition);
        this.carryingCapacity = carryingCapacity;
    }
    
    
    
    
    
    
    
    
    
    @Override
     public String toString() {
        
        
        return   super.getPlatNumber() +":" + super.getPower()  + super.getTransmition().AUTOMATIC.getStr()+"max."+carryingCapacity+"Kg"  ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
