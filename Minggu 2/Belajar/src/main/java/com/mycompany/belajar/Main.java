/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.belajar;

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
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        String nama, jurusan;
        double ipk = 0;
        
        System.out.println("Inputkan Nama Mahasiswa");
        nama = scan.nextLine();
        System.out.println("Inputkan Nama Jurusan");
        jurusan = scan.nextLine();
        System.out.println("Inputkan IPK");
        ipk = scan2.nextFloat();
        
        Mahasiswa mahasiswa1 = new Mahasiswa(nama,jurusan,ipk);
        
        mahasiswa1.setNama(mahasiswa1.getNama() + ".s.Kom.");
        
        System.out.println("");
        mahasiswa1.Print();
        System.out.println("Kelulusan : " + mahasiswa1.cekKelulusan());
        System.out.println("");
       
    }
    
}
