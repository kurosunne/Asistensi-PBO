/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.kunci;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerobak gerobak = new Gerobak(1,1);
        int input = 0;
        int hari = 1;
        double uang = 200;
        while(input!=4){
            System.out.println("=== Tahu Bulat ===");
            System.out.println("Hari : " + hari);
            System.out.println("Uang : " + uang);
            System.out.println("Jumlah Kompor : " + gerobak.getJumlahKompor());
            System.out.println("Level Gerobak : " + gerobak.getLevelGerobak());
            System.out.println("1. Ke Hari Selanjutnya");
            System.out.println("2. Tambah Kompor");
            System.out.println("3. Upgrade Gerobak");
            System.out.println("4. Exit");
            System.out.println("Input : ");
            input = sc.nextInt();
            if (input==1) {
                System.out.println("Mendapatkan Penghasilan " + gerobak.getPenghasilan());
                uang += gerobak.getPenghasilan();
                hari++;
            }else if (input==2) {
                if (gerobak.getJumlahKompor()*50<=uang) {
                    uang-= (gerobak.getJumlahKompor()*50);
                    gerobak.setJumlahKompor(gerobak.getJumlahKompor()+1);
                    System.out.print("Kompor Bertambah 1 (Jumlah Kompor Sekarang " + gerobak.getJumlahKompor() + ")");
                }else{
                    System.out.println("Uang Tidak Cukup! (Butuh "+gerobak.getJumlahKompor()*50+")");
                }
            }else if (input==3) {
                if (gerobak.getLevelGerobak()*50<=uang) {
                    uang-= (gerobak.getLevelGerobak()*50);
                    gerobak.setLevelGerobak(gerobak.getLevelGerobak()+1);
                    System.out.print("Gerobak Diupgrade 1 Level (Level Gerobak Sekarang " + gerobak.getLevelGerobak() + ")");
                }else{
                    System.out.println("Uang Tidak Cukup! (Butuh " +gerobak.getLevelGerobak()*50+ ")");
                }
            }
            System.out.println(hitung());
        }
    }
    
    static int hitung(){
            return 3;
    }
}
