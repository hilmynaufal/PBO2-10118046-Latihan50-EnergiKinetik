/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan50.energikinetik;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung energi kinetik dan usaha bola baseball
 */
public class PBO210118046Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BolaBaseball bola = new BolaBaseball(145, 25);
        System.out.println("Massa bola = " + bola.getMassa() + " kg");
        System.out.println("Kecepatan bola = " + bola.getKec() + " m/s");
        System.out.println("Energi Kinetik = " + bola.ek(bola.getMassa(), bola.getKec()));
        System.out.println("Usaha Bola = " + bola.usaha(bola.getMassa(), bola.getKec(), 0));
    }

}
