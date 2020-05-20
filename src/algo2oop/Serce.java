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
public class Serce extends Kus implements UcabilmeI {
    public Serce(int yas, String cinsiyet, int kilo) {
        super(yas, cinsiyet, kilo);
    }


    public void uc() {
        System.out.println("Serçe çok kolay uçabilir");
    }
    
    
    
}
