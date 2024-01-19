/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisanBangunRuang;

/**
 *
 * @author ASUS
 */
public class limasSegitiga extends BangunRuang{
    double t;
    double a1,a2,a3;
    double tLimas;
    
    @Override
    double volume(){
    double volume= (a1*t/2)*t;
        System.out.println("volume limas segitiga : "+volume);
       return volume;
    }
    @Override
    double luasPermukaan(){
    double luasPermukaan= (a1*t/2)+(a1*tLimas/2)+(a2*tLimas/2)+(a3*tLimas/2);
        System.out.println("luas permukaan limas segitiga : "+luasPermukaan);
        return luasPermukaan;
    
    
}}
