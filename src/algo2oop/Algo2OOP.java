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
public class Algo2OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Kus kus1=new Kus(2,"Erkek",7);
        kus1.yemek();
        kus1.uyku();
        
        
        
        Serce se=new Serce(1,"Dişi",2);
        se.uc();
        se.uyku();
        se.hareket();
        
        
        Balik bal=new Balik(1,"Erkek",3);
        bal.hareket();
        
        
        Hayvan serce=new Serce(2,"Dişi",1); //polymorphism örneği
        //serce.hareket();
        
        Hayvan b=new Balik(3,"Erkek",3);
        //b.hareket();
        
        
        hayvanHareket(bal);
        hayvanHareket(se);  
    }
    
    public static void hayvanHareket(Hayvan hayvan){
        hayvan.hareket();
    }
    
}
