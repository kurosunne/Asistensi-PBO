/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overloading;

/**
 *
 * @author Acer
 */
public class Kalkulator {
    //misal kamu objek pelajar yang dilamnya nama, noInduk, nik
    //simpanData(String nama, String noInduk, String nik)
    //simpanData(String nama, String noInduk) nik = "0129394"
    
    public int pertambahan(int a){
        //misal selalu ditambah 10
        return a+10;
    }
    
    public int pertambahan(int a, int b){
        return a+b;
    }
    
    public int pertambahan(int a, int b, int c){
        return a+b+c;
    }
    
    public int pengurangan(int a, int b){
        return a-b;
    }
    
    public int perkalian(int a, int b){
        return a*b;
    }
    
    public int pembagian(int a, int b){
        return a/b;
    }
}
