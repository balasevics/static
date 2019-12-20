/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvezba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INTEL I7-8700
 */
public class StaticVezba {

    Integer niz[] = new Integer[20];
    Integer niz1[] = new Integer[20];
    ArrayList<Integer> lista = new ArrayList<Integer>();
 
          
    private int x=0;
    
//    ArrayList <Character> lista;

           
        int fun() {
            return x++;
        }
        
        public StaticVezba(){
      
           
       //   lista=new ArrayList<Character>();
        }

    public static void main(String[] args) {
           
       StaticVezba s=new StaticVezba();
    System.out.println(s.fun());
        
        
    }
    
}
