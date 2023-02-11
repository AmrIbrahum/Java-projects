/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author student
 */
public class Lolly implements TrainListHandler {

    
    public void printSortedByDepartureTime(ArrayList<Train> tList) {
        Collections.sort(tList);
        
        
    }

    
    public ArrayList<Train> getSortedByDepartureStation(ArrayList<Train> tList) {
        
        Collections.sort(tList);
        
       // System.out.println(tList.get(1));
                
        return tList;
                
                
    }
    
}
