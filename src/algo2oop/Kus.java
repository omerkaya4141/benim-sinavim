/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2oop;

/**
 *
 * @author xsamu
 */
public class Kus extends Hayvan {

    public Kus(int yas, String cinsiyet, int kilo) {
        super(yas, cinsiyet, kilo);
    }
    
    @Override
    public void hareket() {
        System.out.println("Kuşlar uçar");
    }
    
    
    
}
