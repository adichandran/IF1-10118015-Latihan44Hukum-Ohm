/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan44hukumohm;

/**
 *
 * @author ACER
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat ");
        System.out.println("penghantar akan berbanding lurus dengan beda potensial ");
        System.out.println("pada ujung-ujung kawat penghantar tersebut asalkan suhu ");
        System.out.println("kawat dijaga konstan");
        System.out.println();
    }
    
    public Baterai(float kuat, float hamb) {
        this.kuatArus = kuat;
        this.hambatan = hamb;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
