/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package TestFeedBack;

/**
 *
 * @author iamr0
 */
public enum Transmition {
    
    AUTOMATIC("(a)")
     
    , MANUAL("(m)")
    , SEMIAUTOMATIC; 
    
    String str;
    

    private Transmition() { // i put this one to avoid giving a value to the semtiaumtic
    }
    
    

   Transmition(String str){ // parmaterized constructor 
       this.str = str;
   }
   

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    
        
    
}
