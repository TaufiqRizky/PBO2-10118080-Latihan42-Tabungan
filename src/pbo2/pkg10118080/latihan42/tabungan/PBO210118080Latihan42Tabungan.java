/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=========Program Penarikan Uang=========");
        System.out.print("Masukan Saldo Awal\t\t: ");
        Scanner a = new Scanner(System.in);
        Tabungan tab = new Tabungan(a.nextInt());
        System.out.print("Jumlah uang yang diambil\t: ");
        Scanner b = new Scanner(System.in);
        tab.ambilUang(b.nextInt());
        System.out.println("Saldo Anda sekarang\t\t: "+ tab.getSaldo());
        
    }
    
}
