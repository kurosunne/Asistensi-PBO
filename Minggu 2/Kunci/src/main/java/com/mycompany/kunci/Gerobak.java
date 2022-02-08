/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kunci;

/**
 *
 * @author Acer
 */
public class Gerobak {
    private int jumlahKompor;
    private int levelGerobak;

    public Gerobak(int jumlahKompor, int levelGerobak) {
        this.jumlahKompor = jumlahKompor;
        this.levelGerobak = levelGerobak;
    }

    public int getJumlahKompor() {
        return jumlahKompor;
    }

    public void setJumlahKompor(int jumlahKompor) {
        this.jumlahKompor = jumlahKompor;
    }

    public int getLevelGerobak() {
        return levelGerobak;
    }

    public void setLevelGerobak(int levelGerobak) {
        this.levelGerobak = levelGerobak;
    }
    
    public double getPenghasilan(){
        return (100 + jumlahKompor * 10) * levelGerobak / 10;
    }
}
