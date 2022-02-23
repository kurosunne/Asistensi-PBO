/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bahas;

/**
 *
 * @author Acer
 */
public class Geroibak {
    private int jumlahKompor;
    private int levelGerobak;

    public Geroibak (int jumlah, int level){
        jumlahKompor = jumlah;
        levelGerobak = level;
    }

    public int getJumlahKompor() {
        return jumlahKompor;
    }

    public void setJumlahKompor(int jumlahGerobak) {
        this.jumlahKompor = jumlahGerobak;
    }
    
    public int dapatLevel(){
        return levelGerobak;
    }
    
    public void gantiLevel(int levelGerobak){
        this.levelGerobak = levelGerobak;
    }
    
    public double getPendapatan(){
        return (100 + jumlahKompor * 10) * levelGerobak / 10;
    }
}
