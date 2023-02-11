/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package myTest;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public interface TrainListHandler {
    
    public void printSortedByDepartureTime(ArrayList<Train> tList);
    
    public ArrayList<Train> getSortedByDepartureStation(ArrayList<Train> tList);

    
}
