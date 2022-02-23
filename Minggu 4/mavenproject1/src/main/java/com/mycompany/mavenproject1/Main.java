/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Binatang hewan1 = new Binatang("Momo","Kucing");
        Binatang[] kumpulanHewan = new Binatang[100];
        //sudah ada kumpulanHewan[0] - kumpulanHewan[9]
        //tapi belum di inisialisasi
        kumpulanHewan[99] = new Binatang();
        kumpulanHewan[99].setJenis("Macan");
        System.out.println(kumpulanHewan[99].getNama());
        
        kumpulanHewan[50] = new Binatang("Mimi","Kadal");
        kumpulanHewan[50] = new Binatang();
        System.out.println(kumpulanHewan[50].getNama());

        
        ArrayList<Binatang> kumpulanHewan2 = new ArrayList<>();
        kumpulanHewan2.add(new Binatang("Mumu","Kuda"));
        System.out.println(kumpulanHewan2.get(0).getNama());
        kumpulanHewan2.get(0).setJenis("Burung");
        System.out.println(kumpulanHewan2.get(0).getJenis());
     
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nInput Nama : ");
        String nama = scan.nextLine();
        System.out.println("Input Jenis : ");
        String jenis = scan.nextLine();
        kumpulanHewan[1] = new Binatang(nama,jenis);
        
        System.out.println("Nama Binatang : " + kumpulanHewan[1].getNama());
        System.out.println("Jenis Binatang : " + kumpulanHewan[1].getJenis());
    }
    
}
