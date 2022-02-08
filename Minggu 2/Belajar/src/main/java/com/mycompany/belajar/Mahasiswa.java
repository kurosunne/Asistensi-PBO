/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar;

/**
 *
 * @author Acer
 */
public class Mahasiswa {
    private String nama, jurusan;
    private double ipk;
    
    //cunstructor
                    //Daniel      Informatika     3.5
    public Mahasiswa(String nama, String jurusan, double ipk) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    
    public String cekKelulusan(){
        if (ipk>=2.5) {
            return "LULUS";
        }else{
            return "TIDAK LULUS";
        }
    }
    
    public void Print(){
        System.out.println("Nama : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK : " + ipk);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    
    
    
    
}
