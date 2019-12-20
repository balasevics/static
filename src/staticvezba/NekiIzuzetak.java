/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvezba;

/**
 *
 * @author INTEL I7-8700
 */
public class NekiIzuzetak {
 
    
    private int a;
    
    
    public NekiIzuzetak(){
        a=44;
    }
    
    
    public void uradiNesto () throws MojaGreska{
    
        if(a==44){
      
         throw new MojaGreska("Ovo je moja greska");
            
        }
    
    }
    
}
