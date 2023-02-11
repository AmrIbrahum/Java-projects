/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package TestFeedBack;

import java.util.ArrayList;

/**
 *
 * @author iamr0
 */
public class Main {
    
    public static boolean isVan(Van V){
        if(V.carryingCapacity<50){
            return true;
        }else{
            return false;
        }
        
        
        
    }
    
    
    public static void getsArrayList(ArrayList list){
        System.out.println(list);
        
    }
    

    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        Vechicle v1 = new Vechicle("GTF-264" , "110hp" , Transmition.MANUAL);
        System.out.println(v1);
        
        Van v = new Van(2200,"HJZ-375" , "97hp" ,Transmition.AUTOMATIC );
         System.out.println(v);
         
         
          
          
          
         System.out.println(isVan(v));
         
         ArrayList myVechile = new ArrayList();
         
         myVechile.add(v1);
         myVechile.add(v);
         
         getsArrayList(myVechile);
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
    }
}
