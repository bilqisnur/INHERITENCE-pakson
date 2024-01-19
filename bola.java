/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisanBangunRuang;

/**
 *
 * @author ASUS
 */
public class bola extends BangunRuang{
    double r;

    @Override
    double volume(){
        double volume=4/3*3.14*r*r*r;
        System.out.println("volume bola:"+volume);
        return 0;
    }
    
    double luasPermukaan(){
        double luasPermukaan=4*3.14*r*r;
        System.out.println("luas permukaan bola:"+luasPermukaan);
        return 0;
    }       
  
}

