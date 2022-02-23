/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bahas;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void menu(int hari, double uang, int kompor, int gerobak){
        System.out.println("=== Tahu Bulat ===");
        System.out.println("Hari : " + hari);
        System.out.println("Uang : " + uang);
        System.out.println("Jumlah Kompor : " + kompor);
        System.out.println("Level Gerobak : " + gerobak);
        System.out.println("1. Ganti Hari");
        System.out.println("2. Tambah Jumlah Kompor");
        System.out.println("3. Tambah Level Gerobak");
        System.out.println("4. Exit");
        System.out.println("Input : ");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hari = 0;
        double uang = 200;
        Geroibak gerobak = new Geroibak(1,1);
        int input = 0;
        
        do {
            menu(hari,uang,gerobak.getJumlahKompor(),gerobak.dapatLevel());
            input = scan.nextInt();
            if (input==1) {
                hari++;
                double temp = gerobak.getPendapatan();
                uang += temp;
                System.out.println("Pendapatan hari ini " + temp);
            }else if (input==2) {
                if (uang>=gerobak.getJumlahKompor()*50) {
                    uang-=gerobak.getJumlahKompor()*50;
                    gerobak.setJumlahKompor(gerobak.getJumlahKompor()+1);
                    System.out.println("Kompor Berhasil ditambah, jumlah kompor sekarang "+ gerobak.getJumlahKompor());
                }else{
                    System.out.println("Uang tidak cukup! (butuh " + gerobak.getJumlahKompor()*50 + ")");
                }
            }else if (input==3) {
                if (uang>=gerobak.dapatLevel()*50) {
                    uang-=gerobak.dapatLevel()*50;
                    gerobak.gantiLevel(gerobak.dapatLevel()+1);
                    System.out.println("Gerobak Berhasil diupgrade, level gerobak sekarang "+ gerobak.dapatLevel());
                }else{
                    System.out.println("Uang tidak cukup! (butuh " + gerobak.dapatLevel()*50 + ")");
                }
            }
        } while (input!=4);
    }
    
}
