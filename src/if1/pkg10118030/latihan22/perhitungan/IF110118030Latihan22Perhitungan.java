/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan22.perhitungan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : Program ini berisi tentang perhitungan lingkaran
 */
public class IF110118030Latihan22Perhitungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========Perhitungan Lingkaran=======");
        System.out.print("Masukkan nilai diameter lingakaran : ");
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;
        while (!scanner.hasNextDouble()){
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("Masukkan nilai diameter lingkaran : ");
            scanner.next();
        }
        diameter = scanner.nextDouble();
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari lingkaran = " +(diameter/2)+" cm");
        System.out.println("Luas Lingkaran = " +(3.14*(diameter/2)*(diameter/2))+" cm");
        System.out.println("Keliling Lingkaran = " +(3.14*(diameter))+" cm");
    }   
    
}
