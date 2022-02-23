/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.overloading;

import java.io.IOException;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Kalkulator calc = new Kalkulator();
        //System.out.println(calc.perkalian(5, 10));
        //copy ke garis bawah itu ctrl + shift + arrowBawah
        //copy ke garis bawah itu alt + shift + arrowBawah/atas
        Kalkulator[] kalk = new Kalkulator[10];
        kalk[0] = new Kalkulator();
        kalk[0].perkalian(2, 5);
        System.out.println("ini satu parameter : " + calc.pertambahan(5));
        System.out.println("ini dua parameter : " + calc.pertambahan(5, 7));
        System.out.println("ini dua parameter : " + calc.pertambahan(5, 7, 10));
    }
 
}
