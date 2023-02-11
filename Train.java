/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTest;

import java.time.LocalTime;

/**
 *
 * @author student
 */
public class Train implements Comparable<Train> {
    
     private String departsFrom;
     private String arrivesTo;
     private LocalTime departureTime;
     private  LocalTime arrivalTime;
     private TrainType type;
     
     
     public Train(){
     
     }

    public Train(String departsFrom, String arrivesTo, TrainType type, LocalTime departureTime, LocalTime arrivalTime) {
        this.departsFrom = departsFrom;
        this.arrivesTo = arrivesTo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        if(arrivalTime.isBefore(departureTime))
           
        
        this.type = type;
    }

    
    
    
    
    public String getDepartsFrom() {
        return departsFrom;
    }

    public void setDepartsFrom(String departsFrom) {
        this.departsFrom = departsFrom;
    }

    public String getArrivesTo() {
        return arrivesTo;
    }

    public void setArrivesTo(String arrivesTo) {
        this.arrivesTo = arrivesTo;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public TrainType getType() {
        return type;
    }

    public void setType(TrainType type) {
        this.type = type;
    }

    
    
    @Override
    public String toString() {
        return "Train{" + "departsFrom=" + departsFrom + ", arrivesTo=" + arrivesTo + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", type=" + type + '}';
    }
    
    

    @Override
    public int compareTo(Train o) {
        
        return this.getDepartureTime().compareTo(o.getDepartureTime());
        
    }

   
   
  
    
    
    
    
    
    
    

     
     
     
     
     
    
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
}
