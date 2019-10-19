/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan44hukumohm;


/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program untuk menghitung hasil tegangan dari hukum OHM.
 */
public class IF110118015Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai batt1 = new Baterai(3,12);
        Baterai batt2 = new Baterai();

        System.out.println("Kuat Arus : "+batt1.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+batt1.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+batt1.hitungTegangan()+" volt");
        
    }
    
}
