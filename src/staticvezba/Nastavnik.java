/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvezba;

import java.util.ArrayList;

/**
 *
 * @author INTEL I7-8700
 */
public class Nastavnik {
 
    private String ime, prezime;
    
    ArrayList<Termin> listaTermina=new ArrayList<Termin>();
    
    
    public Nastavnik()
    {
    
    }
    
    
    public void dodajTermin(Termin t) {
    
        listaTermina.add(t);
    }
}
