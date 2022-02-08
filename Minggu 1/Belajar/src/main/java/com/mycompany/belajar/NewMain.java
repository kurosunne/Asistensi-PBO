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
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// TODO code application logic here
        int a = 0;
        char b = 'A';
        float c;
        long f;
        double d = 12;
        String e = "Halo";
       
        System.out.println("");
        //output
        System.out.println("helo");
        //cout --> sout
        System.out.println("Nama Saya Daniel");
        
        //cin --> Scanner
        
        int angka;
        //cin>>angka;
        
        Scanner ScanInt = new Scanner(System.in);
        Scanner ScanString = new Scanner(System.in);
        Scanner tes = new Scanner(System.in);
        
        /*angka = ScanInt.nextInt();
        String kalimat;
        kalimat = ScanString.nextLine();
        char karakter;
        karakter = ScanString.nextLine().charAt(0);
        
        float desimal = ScanInt.nextFloat();
        
        
        System.out.println("Angka : "+angka);
        System.out.println("Kalimat : "+kalimat);
        System.out.println("Karakter : "+karakter);
        System.out.println("Float : "+ desimal);
        
        */
        
        System.out.print("Ini Print Biasa");
        int input = ScanInt.nextInt();
        System.out.println(" HAHAHA");
        
        //String kata = baca.next();
        //System.out.println(kata);
        
        //if
        if (true) {
            
        }else {
            
        }
        
        //for
        for (int i = 0; i < 10; i++) {
            
        }
        
        //dowhile
        boolean jalan = true;
        do {            
            jalan = false;
        } while (jalan);
   
        //wh
//        while (true) {
//            
//        }

        //Array
        //int iniArray[10];
        int iniArrayJava[] = new int[10];
        iniArrayJava[0] = 1;
        iniArrayJava[1] = 2;
        iniArrayJava[2] = 3;
        iniArrayJava[3] = 4;
        iniArrayJava[4] = 5;
        iniArrayJava[5] = 6;
        iniArrayJava[6] = 7;
        iniArrayJava[7] = 8;
        iniArrayJava[8] = 9;
        iniArrayJava[9] = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(iniArrayJava[i]);
        }
        
        int duaDimensi[][] = new int[10][10];
        System.out.println(duaDimensi[3][5]);
        

    }  
}
