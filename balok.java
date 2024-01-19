/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisanBangunRuang;

/**
 *
 * @author ASUS
 */
public class balok extends BangunRuang{
    double p;
    double l;
    double t;
    @Override
    double volume(){
    double volume= p*l*t;
        System.out.println("volume balok :" +volume);
        return volume;
    } 
    @Override
    double luasPermukaan(){
    double luasPermukaan = 2*(p*l+p*t+l*t);
        System.out.println("luas permukaan balok: "+luasPermukaan);
        return luasPermukaan;
    }
    
    
    
    }
