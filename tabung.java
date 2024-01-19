/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisanBangunRuang;

/**
 *
 * @author ASUS
 */
public class tabung extends BangunRuang {
    double r;
    double t;
    
    @Override
    double volume(){
    double volume= 3.14*r*r*t;
        System.out.println("volume tabung :"+volume);
        return volume;
    }
    
    double luasPermukaan(){
    double luasPermukaan= 2*3.14*r*(r+t);
        System.out.println("luas permukaan tabung : " +luasPermukaan);
        return luasPermukaan;
    }
    
}
