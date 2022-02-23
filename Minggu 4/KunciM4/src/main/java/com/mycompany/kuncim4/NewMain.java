/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.kuncim4;

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
        Scanner st = new Scanner(System.in);
        Memo[] memo = new Memo[100];
        int ctr = 0;
        int input=0;
        do {
            System.out.println("=== Memo ===");
            System.out.println("1. Buat Memo");
            System.out.println("2. List Memo");
            System.out.println("3. Baca Memo");
            System.out.println("4. Exit");
            System.out.println("input : ");
            input = sc.nextInt();
            
            if (input==1) {
                System.out.println("=== Buat Memo ===");
                System.out.println("Judul Memo :");
                String judul = st.nextLine();
                System.out.println("Isi Memo :");
                String isi = st.nextLine();
                memo[ctr] = new Memo(judul,isi);
                ctr++;
            }else if (input==2) {
                System.out.println("=== List Memo ===");
                for (int i = 0; i < ctr; i++) {
                    System.out.println((i+1) + ". " + memo[i].getJudul());
                }
            }else if (input==3) {
                System.out.println("=== Baca Memo ===");
                for (int i = 0; i < ctr; i++) {
                    System.out.println((i+1) + ". " + memo[i].getJudul());
                }
                System.out.println("Input : ");
                int pilih = sc.nextInt();
                System.out.println("Judul : " + memo[pilih-1].getJudul());
                System.out.println("Isi : " + memo[pilih-1].getIsi());
            }
            System.out.println("");
        } while (input!=4);
    }
    
}
