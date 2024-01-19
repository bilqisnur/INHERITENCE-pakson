/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisanBangunRuang;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        bola bola = new bola();
        bola.r=3;
        bola.volume();
        bola.luasPermukaan();
        
        balok balok = new balok();
        balok.p=3;
        balok.l=4;
        balok.t=3;
        balok.volume();
        balok.luasPermukaan();
        
        limasSegitiga limasSegitiga = new limasSegitiga();
        limasSegitiga.tLimas=4;
        limasSegitiga.t=6;
        limasSegitiga.a1=4;
        limasSegitiga.a2=3;
        limasSegitiga.a3=4;
        limasSegitiga.volume();
        limasSegitiga.luasPermukaan();
        
        tabung tabung = new tabung();
        tabung.r=6;
        tabung.t=7;
        tabung.volume();
        tabung.luasPermukaan();
        
        
    }
    
}
