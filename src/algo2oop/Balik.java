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
public class Balik extends Hayvan {

    public Balik(int yas, String cinsiyet, int kilo) {
        super(yas, cinsiyet, kilo);
    }

  
    public void yuz(){
        System.out.println("Yüzüyor");
    }

  
    public void hareket() {
        System.out.println("Balıklar yüzer gluk gluk :)");
    }
    
    
}



