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
public abstract class Hayvan {
    
    int yas;
    String cinsiyet;
    int kilo;
    
    
    public Hayvan(int yas, String cinsiyet,int kilo){
        this.yas=yas;
        this.cinsiyet=cinsiyet;
        this.kilo=kilo;
    }
    
    public void yemek(){
        System.out.println("Yemek yiyor");
    }
    
    public void uyku(){
        System.out.println("Uyuyor");
    }
    
    public abstract void hareket();
    
}
